package com.mall.managementsystem.exception;

public class AccessDeniedException extends RuntimeException {

	public AccessDeniedException(String message){
        super(message);
    }
}
