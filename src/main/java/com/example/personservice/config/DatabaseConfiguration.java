package com.example.personservice.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Bean
    public NamedParameterJdbcTemplate hrJdbcTemplate(DataSource hrDataSource) {
        return new NamedParameterJdbcTemplate(hrDataSource);
    }

    @Bean
    @ConfigurationProperties(prefix = "personservice.datasource.hr.configuration")
    public DataSource hrDataSource(DataSourceProperties hrDataSourceProperties) {
        return hrDataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "personservice.datasource.hr")
    public DataSourceProperties hrDataSourceProperties() {
        return new DataSourceProperties();
    }
}
