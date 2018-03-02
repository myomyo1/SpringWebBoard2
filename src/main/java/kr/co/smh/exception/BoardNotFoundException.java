package kr.co.smh.exception;

public class BoardNotFoundException extends Exception{

	@Override
	public String getMessage() {
		return "게시판 ㄴㄴ해";
	}
	
}
