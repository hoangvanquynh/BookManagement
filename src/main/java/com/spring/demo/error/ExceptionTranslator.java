package com.spring.demo.error;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionTranslator extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<Error> errorList = new ArrayList<>();
        ManagerErrors managerErrors = new ManagerErrors();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            Error errors = new Error();
            errors.setCode(error.getCode());
            errors.setMessage(error.getDefaultMessage());
            errorList.add(errors);
        });
        managerErrors.setStatus(false);
        managerErrors.setErrors(errorList);
        return new ResponseEntity<Object>(managerErrors, HttpStatus.BAD_REQUEST);
    }
}
