'use strict';

var SockJS = require('sockjs-client');
require('stompjs');


function register(registration){
	var socket = SockJS('/payroll');
	var stompClient = Stomp.over(socket);
	
	stompClient.connect({}, function(frame){
		registration.forEach( function(registration){
			stompClient.subscribe(registration.route, registration.callback);
		})
	})
}

module.exports.register = register;