var http = require('http');
//var url = require('url');
var fs = require('fs');

//create a server object:
http.createServer(function (req, res) {
    let responseData = '';
    if(req.method === "GET" && req.url === '/'){
        responseData = fs.readFileSync('./simpleTransform.json', {encoding: 'utf-8'});
    }else if(req.method ==="POST" && req.url === '/'){
        responseData = 'Post method'
    }
    res.writeHead(200, {'Content-Type': 'application/json'});
    res.end(responseData); //end the response


}).listen(8081); //the server object listens on port 8081