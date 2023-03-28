package com.mall.managementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mall.managementsystem.response.ResponsePojo;

@ControllerAdvice
public class GlobalException {

//	@ExceptionHandler
//	public ResponseEntity handleAccessDeniedException(AccessDeniedException e) {
//
//		ResponsePojo responsePojo = new ResponsePojo();
//		responsePojo.setStatus(HttpStatus.BAD_REQUEST.value());
//		responsePojo.setObj("dhfojdah");
//
//		return ResponseEntity.status(responsePojo.getStatus()).body(responsePojo);
//	}

//	@ExceptionHandler
//	public ResponseEntity handleException(Exception e) {
//
//		ResponsePojo responsePojo = new ResponsePojo();
//		responsePojo.setMessage("Oops..Something went wrong!");
//		responsePojo.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(responsePojo);
//	}

	@ExceptionHandler
	public ResponseEntity handleBadRequestException(BadRequestException e) {

		ResponsePojo responsePojo = new ResponsePojo();
		responsePojo.setStatus(HttpStatus.BAD_REQUEST.value());
//		responsePojo.setObj(e.getErrors());
		responsePojo.setMessage("Bad Request Check the date");
		return ResponseEntity.status(400).body(responsePojo);
	}

}
