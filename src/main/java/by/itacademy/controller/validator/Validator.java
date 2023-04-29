package by.itacademy.controller.validator;

public interface Validator<T> {
    ValidationResult isValid(T object);
}
