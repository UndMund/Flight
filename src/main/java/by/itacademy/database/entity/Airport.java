package by.itacademy.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Airport {
    @Id
    @Column(nullable = false, unique = true)
    private String code;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private String city;
}
