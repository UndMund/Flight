package by.itacademy.mapper;

public interface Mapper<F, T> {

    T mapFrom(F object);
}
