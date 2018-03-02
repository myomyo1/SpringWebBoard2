package kr.co.smh.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PageNotFoundException extends RuntimeException{
	
	@Override
	public String getMessage() {
		return "페이지 없어 이새끼야";
	}

}
