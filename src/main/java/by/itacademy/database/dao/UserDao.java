package by.itacademy.database.dao;

import by.itacademy.database.entity.Gender;
import by.itacademy.database.entity.Role;
import by.itacademy.utils.HibernateUtil;
import lombok.Cleanup;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import by.itacademy.database.entity.User;
import lombok.extern.slf4j.Slf4j;

import static java.sql.Statement.RETURN_GENERATED_KEYS;
import static lombok.AccessLevel.PRIVATE;

@Slf4j
@NoArgsConstructor(access = PRIVATE)
public class UserDao implements Dao<Integer, User> {

    private static final UserDao INSTANCE = new UserDao();

    public static UserDao getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean update(User user) {
        var configuration = HibernateUtil.getConfiguration();
        @Cleanup var sessionFactory = configuration.buildSessionFactory();
        @Cleanup var session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(user);

        session.getTransaction().commit();
        return true;
    }

    @Override
    public Optional<User> findById(Integer id) {
        var configuration = HibernateUtil.getConfiguration();
        @Cleanup var sessionFactory = configuration.buildSessionFactory();
        @Cleanup var session = sessionFactory.openSession();
        session.beginTransaction();

        return Optional.ofNullable(session.get(User.class, id));
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        var configuration = HibernateUtil.getConfiguration();
        @Cleanup var sessionFactory = configuration.buildSessionFactory();
        @Cleanup var session = sessionFactory.openSession();
        session.beginTransaction();

        Optional<User> user = findById(id);
        if (user.isEmpty()) {
            return false;
        }
        session.delete(user.get());

        session.getTransaction().commit();
        return true;
    }

    @Override
    public User save(User user) {
        var configuration = HibernateUtil.getConfiguration();
        @Cleanup var sessionFactory = configuration.buildSessionFactory();
        @Cleanup var session = sessionFactory.openSession();
        session.beginTransaction();

        user.setId((Integer) session.save(user));

        session.getTransaction().commit();
       return user;
    }
}
