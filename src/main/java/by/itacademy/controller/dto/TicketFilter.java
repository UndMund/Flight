package by.itacademy.controller.dto;

public record TicketFilter(int limit,
                           int offset,
                           String passengerName,
                           String seatNo) {
}
