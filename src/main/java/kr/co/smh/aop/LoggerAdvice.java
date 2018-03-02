package kr.co.smh.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect //사용자가 원래하려고했던 행위들을 (회원가입, 로그인, 게시글 쓰기 등등) 대신 해주겠다는 어노테이션
public class LoggerAdvice {

	Logger logger = LoggerFactory.getLogger(LoggerAdvice.class);

	//user 관련된 서비스가 실행 될 때의 포인트컷
	@Around("within(kr.co.smh.service.user..*)") //porxy가 어디에있는 메소드를 실행할것인가를 알려주는 것
	// @Around("execution(* kr.co.smh.service.user..*(..))")
	public Object userLogger(ProceedingJoinPoint joinPoint) throws Throwable {
		String signature = joinPoint.getSignature().toShortString();
		logger.info("=============="+signature + " 실행 시작합니다.============="); // 1.사용자가 target 가기전에 proxy에서 로그 찍음
		try {
			Object obj = joinPoint.proceed();  // 2. 인포 찍고 난 후 원래 하려던 (타켓에 있는) 메소드 실행함 porceed()
			return obj;
		} finally {
			logger.info("============="+signature + " 실행 종료합니다.=============");
		}
	}
}