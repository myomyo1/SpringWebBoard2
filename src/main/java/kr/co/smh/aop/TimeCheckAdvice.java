package kr.co.smh.aop;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.smh.domain.mongo.dto.LogDTO;
import kr.co.smh.mongo.log.MongoLogger;

@Component // 얘로 인해 bean(객체)이 될 수 있음 (xml(스프링컴포넌트)에 의해서). 
@Aspect // 프록시를 만들기 위해 감싸주는 것.
public class TimeCheckAdvice {

	@Autowired
	private HttpSession session;

	@Autowired
	private MongoLogger mongoLogger;

	private static final Logger logger = LoggerFactory.getLogger(TimeCheckAdvice.class);

	// @Around("execution(* kr.co.smh.service..*(..))")
	// -> 포인트컷 이라고한다. 언제실행되야할지를 결정지어주는 것 
	// 보통 패키지가 들어가며 그 패키지 안에 모든 메소드에 대해서 타임로그(어드바이스(비포 에프터 등등 어라운드 포함) : 관점으로서 실행되어야할 기능)를 찍으라는 의미
	// target은 객체 joinPoint는 타겟안에 있는 메소드 timelog는 메소드를 실행시켜주는 것 
	// 언제 어떠한시점에 실행되야할지가 정해지면 그때 timelog 어드바이스를 완성했다고 한다.
	@Around("within(kr.co.smh.service..*)")
	public Object timeLog(ProceedingJoinPoint joinPoint) throws Throwable { 
		String signature = joinPoint.getSignature().toShortString(); 
		logger.info(signature + " is start"); 
		long st = System.currentTimeMillis();

		try {
			logger.info(signature + " Running");
			Object obj = joinPoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			LogDTO logDTO = new LogDTO();
			logDTO.setSignature(signature);
			logDTO.setCurrentTime(et - st);
			mongoLogger.insertLog(logDTO);
			logger.info(signature + " is finished");
			logger.info(signature + " 경과시간 : " + (et - st));
		}
	}
}