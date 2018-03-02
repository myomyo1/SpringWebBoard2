package kr.co.smh.mongo.log.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import kr.co.smh.domain.mongo.dto.LogDTO;
import kr.co.smh.mongo.log.MongoLogger;

public class MongoLoggerImpl implements MongoLogger{

	@Autowired
	private MongoTemplate mongoTemplate; 
	
	@Override
	public void insertLog(LogDTO logDTO) throws Exception {
		mongoTemplate.insert(logDTO, "service_log");
	}

}
