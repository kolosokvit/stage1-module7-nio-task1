package com.epam.mjc.nio;

public class ImpossibleToPerformReadingFromFileException extends RuntimeException {
    public ImpossibleToPerformReadingFromFileException(String message) {
        super(message);
    }

    public ImpossibleToPerformReadingFromFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
