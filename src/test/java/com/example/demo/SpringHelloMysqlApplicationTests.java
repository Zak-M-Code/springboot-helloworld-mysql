package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.repository.UserRepository;

@SpringBootTest
class SpringHelloMysqlApplicationTests {

    // create a mock bean so context startup won't require a real JPA repository/DB
    @MockBean
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        // context loads with a mocked UserRepository
    }

}
