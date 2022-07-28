package com.feng.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
	@Autowired
    private Environment env;
	
    @Bean(name="dataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driverClass"));
        dataSource.setUrl(env.getProperty("jdbc.connectionUrl"));
        dataSource.setUsername(env.getProperty("jdbc.username"));
        dataSource.setPassword(env.getProperty("jdbc.password"));
        dataSource.setMaxActive(20);
        dataSource.setInitialSize(10);
        dataSource.setMaxWait(300);
        return dataSource;
    }
    
    
}

