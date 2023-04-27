package by.itacademy.validator;

public interface Validator<T> {
    ValidationResult isValid(T object);
}
