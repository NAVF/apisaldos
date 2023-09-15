package com.example.apisaldos.exceptions;

import com.example.apisaldos.dto.ExceptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResponseEntityExceptionHandler {

    @ExceptionHandler(value = GenericExceptions.class)
    public ResponseEntity<ExceptionDto> genericExceptionHandler(GenericExceptions ex){
        ExceptionDto exception = ExceptionDto.builder().code(ex.getCode()).message(ex.getMessage()).build();
        return new ResponseEntity<>(exception, ex.getStatus());
    }
}
