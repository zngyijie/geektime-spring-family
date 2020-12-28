package geektime.spring.data.datasourcedemo;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 配置类
@Configuration
public class ConfigurationBeanTest {

    /**
     * 配置dataSource数据源
     */
    @Bean(destroyMethod = "close")
    public BasicDataSource dataSource2() throws Exception {
        Properties properties = new Properties();
        System.out.println("hhh");
        properties.setProperty("driverClassName", "org.h2.Driver");
        properties.setProperty("url", "jdbc:h2:mem:testdb");
        properties.setProperty("username", "sa");
        return BasicDataSourceFactory.createDataSource(properties);
    }
}
