package by.itacademy.database.dao;


import by.itacademy.exception.DaoException;
import by.itacademy.controller.dto.TicketFilter;
import by.itacademy.database.entity.Ticket;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TicketDao implements Dao<Long, Ticket> {
    private static final TicketDao INSTANCE = new TicketDao();
    private static final FlightDao flightDao = FlightDao.getInstance();
    public static TicketDao getInstance() {
        return INSTANCE;
    }


    @Override
    public boolean update(Ticket ticket) {
        return false;
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Ticket> findAll() {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Ticket save(Ticket ticket) {
        return null;
    }
}
