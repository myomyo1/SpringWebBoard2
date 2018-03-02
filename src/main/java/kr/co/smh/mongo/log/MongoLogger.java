package kr.co.smh.mongo.log;

import kr.co.smh.domain.mongo.dto.LogDTO;

public interface MongoLogger {
	public void insertLog(LogDTO logDTO) throws Exception;
}
