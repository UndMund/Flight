package by.itacademy.database.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String flightNo;
    @Column(nullable = false)
    private LocalDateTime departureDate;
    @Column(nullable = false)
    private String departureAirportCode;
    @Column(nullable = false)
    private LocalDateTime arrivalDate;
    @Column(nullable = false)
    private String arrivalAirportCode;
    @Column(nullable = false)
    private Integer aircraftId;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FlightStatus status;

    protected boolean canEqual(final Object other) {
        return other instanceof Flight;
    }
}
