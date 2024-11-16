package global.goit.config;

import org.flywaydb.core.Flyway;

public final class FlywayMigrator {

    public static void migrateDatabase() {
        try {
            String locations = "db/migration";
            Flyway flyway = Flyway.configure()
                    .dataSource(HibernateConfigConstants.HB_URL, HibernateConfigConstants.HB_USER,
                            HibernateConfigConstants.HB_PASS)
                    .locations(locations)
                    .load();
            flyway.migrate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
