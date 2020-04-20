package com.springjpa.common;

/**
 * @description:
 * @author: fandp
 * @create: 2020-04-14 15:04
 **/


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;

/**
 * spring boot jpa 数据源的配置
 * 注册datasource到spring 容器
 */
@Configuration
public class DataSourceConfig {
    @Primary
    @Bean(name = "primaryDataSourceProperties")
    @Qualifier("primaryDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.primary.datasource")
    public DataSourceProperties primaryDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix = "spring.primary.datasource")
    public DataSource primaryDataSource() {
        return primaryDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "secondaryDataSourceProperties")
    @Qualifier("secondaryDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.secondary.datasource")
    public DataSourceProperties secondaryDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
    @ConfigurationProperties(prefix = "spring.secondary.datasource")
    public DataSource secondaryDataSource() {

        return secondaryDataSourceProperties().initializeDataSourceBuilder().build();
    }
}
