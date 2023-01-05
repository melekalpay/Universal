package com.uniyaz.db.exception;

public class InvalidNameException extends Exception {

        public InvalidNameException() {
            super("Tabloda girdiğiniz isim bulunamadı.");
        }

        public InvalidNameException(String message) {
            super(message);
        }


}
