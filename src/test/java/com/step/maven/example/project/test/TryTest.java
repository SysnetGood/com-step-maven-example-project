package com.step.maven.example.project.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TryTest extends BaseTestClass {

    @Test
    public void verifyUrl() {
        String url = System.getProperty("base-url");
        Assertions.assertEquals("http:\\\\google.com", url);
    }

    @Test
    public void verifyUsername () {
        String username = System.getProperty("username");
        Assertions.assertEquals("admin", username);
    }
}
