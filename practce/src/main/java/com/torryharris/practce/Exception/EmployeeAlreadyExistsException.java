package com.torryharris.practce.Exception;

public class EmployeeAlreadyExistsException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public EmployeeAlreadyExistsException() {
    }

    public EmployeeAlreadyExistsException(String s) {
        super(s);
    }
}
