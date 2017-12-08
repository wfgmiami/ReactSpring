const path = require('path');

module.exports = {
		entry: "./src/main/js/app.js",
		output: {
			path:__dirname,
			filename:"./src/main/resources/static/build/bundle.js"
		},
		devtool:"source-map",
		resolve:{
			alias: {
				'stompjs': path.join(__dirname, '/node_modules/stompjs/lib/stomp.js'),
			}
		},
		module: {
			loaders:[
				{
					test: path.join(__dirname, "."),
					exclude:  /node_modules/,
					loader:"babel",
					query: { 
						presets: ['es2015', 'react']
					}
				}
				
			
			]
		}
}