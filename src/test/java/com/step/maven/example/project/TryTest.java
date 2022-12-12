package com.step.maven.example.project;

import com.step.maven.example.project.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TryTest extends BaseTestClass {

    @Autowired
    UserRepository userRepository;

    @Test
    public void verifyUrl() {
        String url = System.getProperty("base-url");
        Assertions.assertEquals("http:\\\\google.com", url);
    }

    @Test
    public void verifyUsername () {
        String username = System.getProperty("user-name");
        Assertions.assertNotEquals("admin", username);
    }

    @Test
    public void tryConnectToDB () {
        User user = userRepository.getOne(1);
        System.out.println(user.toString());
    }
}
