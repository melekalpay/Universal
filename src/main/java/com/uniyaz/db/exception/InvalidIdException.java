package com.uniyaz.db.exception;

public class InvalidIdException extends Exception{
    public InvalidIdException() {
        super("Tabloda girdiğiniz id bulunamadı.");
    }

    public InvalidIdException(String message) {
        super(message);
    }
}
