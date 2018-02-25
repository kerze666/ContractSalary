package com.salary.exception;

public class WorkIncompleteException extends RuntimeException {
    public WorkIncompleteException() {
    }

    public WorkIncompleteException(String message) {
        super(message);
    }

    public WorkIncompleteException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkIncompleteException(Throwable cause) {
        super(cause);
    }

    public WorkIncompleteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
