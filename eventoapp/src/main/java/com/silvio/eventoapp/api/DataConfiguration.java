package com.silvio.eventoapp.api;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DataConfiguration {

    private static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String DRIVER_URL = "jdbc:mysql://localhost:3306/eventosapp?useTimezone=true&serverTimezone=UTC";
    private static final String DRIVER_USERNAME = "root";
    private static final String DRIVER_PASSWORD = "root";

    private static final String JPA_DB_PLATFORM = "org.hibernate.dialect.MySQL5Dialect";
    
    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DRIVER_CLASS_NAME);
        dataSource.setUrl(DRIVER_URL);
        dataSource.setUsername(DRIVER_USERNAME);
        dataSource.setPassword(DRIVER_PASSWORD);
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        final HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlatform(JPA_DB_PLATFORM);
        adapter.setPrepareConnection(true);
        return adapter;
    }
}