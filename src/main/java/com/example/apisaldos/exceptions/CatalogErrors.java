package com.example.apisaldos.exceptions;

import org.springframework.http.HttpStatus;

public enum CatalogErrors {
    BALANCE_BALANCE_E404_001("E404_001", HttpStatus.NOT_FOUND, "Registro de saldo de usuario no encontrado."),
    BALANCE_BALANCE_E404_002("E404_002", HttpStatus.NOT_FOUND, "Registro de saldo no encontrado.")
    /*PAY_EXCHANGE_RATE_E500_001("E500_001", HttpStatus.INTERNAL_SERVER_ERROR, "Error al registrar nuevo tipo de cambio."),
    PAY_EXCHANGE_RATE_E400_001("E400_001", HttpStatus.BAD_REQUEST, "Ya existe registro con moneda origen y destino especificados."),*/;

    private final GenericExceptions exception;

    CatalogErrors(String code, HttpStatus httpStatus, String message) {
        exception = new GenericExceptions(code, httpStatus, message);
    }

    public GenericExceptions getException(){return exception;}
}
