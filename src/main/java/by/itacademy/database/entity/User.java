package by.itacademy.database.entity;


import by.itacademy.database.converter.BirthdayConvertor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 124)
    private String name;
    @Convert(converter = BirthdayConvertor.class)
    @Column(nullable = false)
    private Birthday birthday;
    @Column(nullable = false, unique = true, length = 124)
    private String email;
    @Column(nullable = false, length = 32)
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
