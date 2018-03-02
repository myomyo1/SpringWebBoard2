package kr.co.smh.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice("kr.co.smh.controller")
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public String exception_result_page(Model model, Exception e) {
		model.addAttribute("ex", e.getMessage());
		return "java_except_page";
	}

	@ExceptionHandler(value = PageNotFoundException.class)
	public String http_exception() {
		return "http_error_page";
	}

}
