package by.itacademy.database.dao;

import by.itacademy.database.entity.Aircraft;

import java.util.List;
import java.util.Optional;

public class AircraftDao implements Dao<Integer, Aircraft>{
    @Override
    public boolean update(Aircraft aircraft) {
        return false;
    }

    @Override
    public Optional<Aircraft> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Aircraft> findAll() {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Aircraft save(Aircraft aircraft) {
        return null;
    }
}
