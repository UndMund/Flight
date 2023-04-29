package by.itacademy.controller.mapper;

import by.itacademy.controller.dto.CreateUserDto;
import by.itacademy.database.entity.Birthday;
import by.itacademy.database.entity.Gender;
import by.itacademy.database.entity.Role;
import by.itacademy.database.entity.User;
import by.itacademy.utils.LocalDateFormatter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class CreateUserMapper implements Mapper<CreateUserDto, User> {

    private static final CreateUserMapper INSTANCE = new CreateUserMapper();

    @Override
    public User mapFrom(CreateUserDto object) {
        return User.builder()
                .name(object.getName())
                .email(object.getEmail())
                .password(object.getPassword())
                .birthday(new Birthday(LocalDate.parse(object.getBirthday())))
                .gender(Gender.valueOf(object.getGender()))
                .role(Role.valueOf(object.getRole()))
                .build();
    }

    public static CreateUserMapper getInstance() {
        return INSTANCE;
    }
}
