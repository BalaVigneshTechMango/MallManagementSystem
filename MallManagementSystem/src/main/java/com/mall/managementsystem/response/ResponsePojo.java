package com.mall.managementsystem.response;

public class ResponsePojo {

	private String message;
	private boolean istrue;
	private Object obj;
	private Integer status;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isIstrue() {
		return istrue;
	}

	public void setIstrue(boolean istrue) {
		this.istrue = istrue;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}
