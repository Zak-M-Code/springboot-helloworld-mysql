package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/*
 * Prevent DataSource + Hibernate auto-configuration from running during this test,
 * and mock the UserRepository so autowiring succeeds.
 */
@SpringBootTest(properties = {
    "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration"
})
class SpringHelloMysqlApplicationTests {

    @MockBean
    private com.example.demo.repository.UserRepository userRepository;

    @Test
    void contextLoads() {
        // context starts without connecting to a real DB
    }

}
