package by.itacademy.utils;

import by.itacademy.database.converter.BirthdayConvertor;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.cfg.Configuration;

@Slf4j
@UtilityClass
public final class HibernateUtil {
    private final Configuration configuration;

    static {
        configuration = new Configuration();
        configuration.configure();
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
    }

    public static Configuration getConfiguration() {
        return configuration;
    }
}
