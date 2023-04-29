package by.itacademy.controller.service;

import by.itacademy.database.dao.TicketDao;
import by.itacademy.controller.dto.TicketDto;

import java.util.List;
import java.util.stream.Collectors;

public class TicketService {
    private final static TicketService INSTANCE = new TicketService();
    private final TicketDao ticketDao = TicketDao.getInstance();

    public List<TicketDto> findAllByFlightId(Long flightId) {
        return null;
    }

    public static TicketService getInstance() {
        return INSTANCE;
    }

    private TicketService() {
    }
}
