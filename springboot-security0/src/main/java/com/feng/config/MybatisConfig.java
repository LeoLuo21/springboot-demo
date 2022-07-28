package com.feng.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class MybatisConfig {

    @Resource
    private DataSource dataSource;

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(ApplicationContext applicationContext) throws IOException {

        org.springframework.core.io.Resource[] resources = applicationContext.getResources("classpath:mapper/*.xml");
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMapperLocations(resources);
        factoryBean.setTypeAliasesPackage("com.feng.beans");
        return factoryBean;
    }

}
