package by.itacademy.jdbc.starter.entity;

import lombok.*;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    private Long id;
    private String flightNo;
    private LocalDateTime departureDate;
    private String departureAirportCode;
    private LocalDateTime arrivalDate;
    private String arrivalAirportCode;
    private Integer aircraftId;
    private FlightStatus status;



    protected boolean canEqual(final Object other) {
        return other instanceof Flight;
    }

}
