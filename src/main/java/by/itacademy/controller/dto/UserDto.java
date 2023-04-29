package by.itacademy.controller.dto;

import by.itacademy.database.entity.Gender;
import by.itacademy.database.entity.Role;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Value
@Builder
public class UserDto {
    Integer id;
    String name;
    LocalDate birthday;
    String email;
    Role role;
    Gender gender;
}
