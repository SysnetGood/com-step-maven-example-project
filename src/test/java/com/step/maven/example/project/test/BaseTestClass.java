package com.step.maven.example.project.test;

import org.junit.jupiter.api.BeforeAll;

public class BaseTestClass implements PropertiesReader{

    @BeforeAll
    public void readProperties() {
        readPropertiesFile();
    }
}
