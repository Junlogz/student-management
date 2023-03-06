package com.student.manage.config;

import com.github.pagehelper.PageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/3 22:44
 */
@Configuration
@MapperScan(basePackages = {"com.student.manage.mapper"})
public class MybatisConfig {

    /**
     * 配置数据源
     *
     * @return DruidDataSource
     */
/*  @Bean
  @ConfigurationProperties(prefix = "spring.datasource")
  public DruidDataSource druidDataSource() {
    return new DruidDataSource();
  }*/

    /**
     * 分页拦截器配置
     */
    @Bean
    public PageInterceptor pageInterceptors() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("reasonable", "false");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "count=check");
        properties.setProperty("params", "count=countSql");
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }

}
