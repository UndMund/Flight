package by.itacademy.exception;

import lombok.Getter;
import by.itacademy.controller.validator.Error;

import java.util.List;

public class ValidationException extends RuntimeException {

    @Getter
    private final List<Error> errors;

    public ValidationException(List<Error> errors) {
        this.errors = errors;
    }
}