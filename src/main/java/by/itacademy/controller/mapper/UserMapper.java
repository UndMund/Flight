package by.itacademy.controller.mapper;

import by.itacademy.controller.dto.UserDto;
import by.itacademy.database.entity.User;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class UserMapper implements Mapper<User, UserDto> {
    private static final UserMapper INSTANCE = new UserMapper();

    @Override
    public UserDto mapFrom(User object) {
        return UserDto.builder()
                .id(object.getId())
                .name(object.getName())
                .email(object.getEmail())
                .role(object.getRole())
                .gender(object.getGender())
                .build();
    }

    public static UserMapper getInstance() {
        return INSTANCE;
    }
}
