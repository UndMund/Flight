package by.itacademy.database.dao;

import by.itacademy.database.entity.*;
import by.itacademy.utils.HibernateUtil;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

@Slf4j
public class Main {
    public static void main(String[] args) {
        System.out.println(UserDao.getInstance().save(
                User.builder()
                        .name("nazar")
                        .birthday(new Birthday(LocalDate.now()))
                        .email("zavadski@mail.ru")
                        .password("123")
                        .role(Role.ADMIN)
                        .gender(Gender.MALE)
                        .build()
        ));
    }
}
