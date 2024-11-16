package global.goit.config;

import global.goit.util.PropertiesUtil;

public final class HibernateConfigConstants {

    public static final String HB_DIALECT = PropertiesUtil.get("hibernate.dialect");
    public static final String HB_CONN_DRIVER_CLASS = PropertiesUtil.get("hibernate.connection.driver_class");
    public static final String HB_URL = PropertiesUtil.get("hibernate.connection.url");
    public static final String HB_USER = PropertiesUtil.get("hibernate.connection.user");
    public static final String HB_PASS = PropertiesUtil.get("hibernate.connection.password");
    public static final String HB_POOL_SIZE = PropertiesUtil.get("hibernate.connection.pool_size");
    public static final String HB_SHOW_SQL = PropertiesUtil.get("hibernate.show_sql");
    public static final String HB_FORMAT_SQL = PropertiesUtil.get("hibernate.format_sql");
    public static final String HB_HBM2DDL_AUTO = PropertiesUtil.get("hibernate.hbm2ddl.auto");
    public static final String HB_AUTOCOMMIT = PropertiesUtil.get("hibernate.connection.autocommit");


    private HibernateConfigConstants() {

    }

}
