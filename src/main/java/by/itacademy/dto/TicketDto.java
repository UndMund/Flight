package by.itacademy.dto;

import lombok.*;

@Value
public class TicketDto {
    Long id;
    Long flightId;
    String seatNo;
}
