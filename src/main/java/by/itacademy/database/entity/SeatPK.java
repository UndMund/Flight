package by.itacademy.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SeatPK implements Serializable {
    @Column(nullable = false)
    private Integer aircraftId;
    @Column(nullable = false)
    private String seatNo;
}
