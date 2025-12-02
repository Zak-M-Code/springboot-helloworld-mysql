package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootTest(exclude = { DataSourceAutoConfiguration.class })
class SpringHelloMysqlApplicationTests {

    @Test
    void contextLoads() {
        // test will pass without connecting to MySQL
    }

}
