package com.torryharris.practce.Exception;

public class DepartmentNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DepartmentNotFoundException() {
    }

    public DepartmentNotFoundException(String s) {
        super(s);
    }
}
