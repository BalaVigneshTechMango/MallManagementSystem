package com.mall.managementsystem.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mall.managementsystem.response.ResponsePojo;

@RestControllerAdvice
public class ValidationHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponsePojo handleValidationExceptions(MethodArgumentNotValidException ex) {
		ResponsePojo responsePojo = new ResponsePojo();
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			errors.put(fieldName, message);
		});
        responsePojo.setMessage("Not Valid Request");
		responsePojo.setObj(errors);
		return responsePojo;
	}
}