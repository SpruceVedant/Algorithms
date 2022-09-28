'use strict';

var express = require('express');
var router = express.Router();

var uuid = require('uuid');
var crypto = require('crypto');
var getHash = function() {
  return crypto.createHash('md5').update(uuid.v4().bytes).digest('hex').substr(0, 12);
};

var redis = require('redis');
var redisClient = redis.createClient();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

router.post('/api/v1/create', function(req, res, next) {
  if (!req.body.magnet || !req.body.name) {
    return res.json({error: 'bad_request'});
  }

  var h = getHash();
  var props = {
    magnet: req.body.magnet,
    name: req.body.name
  };
  redisClient.hmset(h, props);

  return res.json({
    key: h
  });
});

module.exports = router;
