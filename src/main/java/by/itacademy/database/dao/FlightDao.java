package by.itacademy.database.dao;

import by.itacademy.exception.DaoException;
import by.itacademy.database.entity.Flight;
import by.itacademy.database.entity.FlightStatus;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FlightDao implements Dao<Long, Flight>{
    private static final FlightDao INSTANCE = new FlightDao();

    public static FlightDao getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean update(Flight flight) {
        return false;
    }

    @Override
    public Optional<Flight> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Flight> findAll() {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Flight save(Flight flight) {
        return null;
    }
}
