package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface EtcService {

	// 메일 보내기를 처리할 메소드
	public boolean mailSend(HttpServletRequest request);
	
	
	
	public String proxy(HttpServletRequest request);
	
	public void push(HttpServletRequest request, HttpServletResponse response);

}
