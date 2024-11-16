package global.goit.config;

import global.goit.entity.Client;
import global.goit.entity.Planet;
import global.goit.entity.Ticket;
import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Getter
public final class HibernateConfig {
    private static final HibernateConfig INSTANCE;
    private final SessionFactory sessionFactory;

    static {
        FlywayMigrator.migrateDatabase();
        INSTANCE = new HibernateConfig();
    }

    private HibernateConfig() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Client.class);
        configuration.addAnnotatedClass(Planet.class);
        configuration.addAnnotatedClass(Ticket.class);
        configuration.setProperty("hibernate.connection.driver_class", HibernateConfigConstants.HB_CONN_DRIVER_CLASS);
        configuration.setProperty("hibernate.connection.url", HibernateConfigConstants.HB_URL);
        configuration.setProperty("hibernate.connection.username", HibernateConfigConstants.HB_USER);
        configuration.setProperty("hibernate.connection.password", HibernateConfigConstants.HB_PASS);
        configuration.setProperty("hibernate.dialect", HibernateConfigConstants.HB_DIALECT);
        configuration.setProperty("hibernate.connection.pool_size", HibernateConfigConstants.HB_POOL_SIZE);
        configuration.setProperty("hibernate.hbm2ddl.auto", HibernateConfigConstants.HB_HBM2DDL_AUTO);
        configuration.setProperty("hibernate.show_sql", HibernateConfigConstants.HB_SHOW_SQL);
        configuration.setProperty("hibernate.format_sql", HibernateConfigConstants.HB_FORMAT_SQL);
        configuration.setProperty("hibernate.connection.autocommit", HibernateConfigConstants.HB_AUTOCOMMIT);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static HibernateConfig getInstance() {
        return INSTANCE;
    }

    public void close() {
        sessionFactory.close();
    }

}


