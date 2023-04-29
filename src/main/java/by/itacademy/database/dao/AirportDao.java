package by.itacademy.database.dao;

import by.itacademy.database.entity.Airport;

import java.util.List;
import java.util.Optional;

public class AirportDao implements Dao<String, Airport> {
    @Override
    public boolean update(Airport airport) {
        return false;
    }

    @Override
    public Optional<Airport> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Airport> findAll() {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Airport save(Airport airport) {
        return null;
    }
}
