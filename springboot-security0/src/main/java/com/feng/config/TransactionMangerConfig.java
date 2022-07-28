package com.feng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class TransactionMangerConfig {

    @Resource
    private DataSource dataSource;

    @Bean
    public TransactionManager transactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
