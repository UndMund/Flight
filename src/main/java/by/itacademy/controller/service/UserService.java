package by.itacademy.controller.service;

import by.itacademy.database.dao.UserDao;
import by.itacademy.controller.dto.CreateUserDto;
import by.itacademy.controller.dto.UserDto;
import by.itacademy.exception.ValidationException;
import by.itacademy.controller.mapper.CreateUserMapper;
import by.itacademy.controller.mapper.UserMapper;
import by.itacademy.controller.validator.CreateUserValidator;
import lombok.NoArgsConstructor;

import java.util.Optional;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class UserService {
    private static final UserService INSTANCE = new UserService();

    private final CreateUserValidator createUserValidator = CreateUserValidator.getInstance();
    private final UserDao userDao = UserDao.getInstance();
    private final CreateUserMapper createUserMapper = CreateUserMapper.getInstance();
    private final UserMapper userMapper = UserMapper.getInstance();

    public Optional<UserDto> login(String email, String password) {
        return Optional.empty();
    }

    public Integer create(CreateUserDto userDto) {
        var validationResult = createUserValidator.isValid(userDto);
        if (!validationResult.isValid()) {
            throw new ValidationException(validationResult.getErrors());
        }
        var userEntity = createUserMapper.mapFrom(userDto);
        userDao.save(userEntity);
        return userEntity.getId();
    }

    public static UserService getInstance() {
        return INSTANCE;
    }
}
