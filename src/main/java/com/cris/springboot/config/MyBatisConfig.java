package com.cris.springboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisConfig
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
@Configuration
public class MyBatisConfig {

    /**
    * @Author zc-cris
    * @Description 为容器中加入开启了驼峰命名规则的配置定制类
    * @Param []
    * @return org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer
    **/
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
