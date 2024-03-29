package com.laptrinhjavaweb.utils;

import javax.servlet.http.HttpServletRequest;

public class SessionUtil {
	
	private static SessionUtil  sessionUtil= null;
	
	public static SessionUtil getInstance() {//kiem tra da new chua neu roi thi dung lai
		if(sessionUtil == null) {
			sessionUtil = new SessionUtil();
		}
		return sessionUtil;
	}
	
	public void putValue(HttpServletRequest req, String key, Object value) { //duy tti thong tin nguoi dung
		req.getSession().setAttribute(key, value);	
	}
	
	public Object getValue(HttpServletRequest req, String key) {//lay thong tin ra
		
		return req.getSession().getAttribute(key);
	}
	
	public void removeValue(HttpServletRequest req, String key) {//xoa session
		req.getSession().removeAttribute(key);
	}
}
