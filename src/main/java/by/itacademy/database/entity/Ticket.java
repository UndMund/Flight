package by.itacademy.database.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String passportNo;
    @Column(nullable = false)
    private String passengerName;
    @Column(nullable = false)
    private Integer flightId;
    @Column(nullable = false)
    private String seatNo;
    @Column(nullable = false)
    private BigDecimal cost;
}
