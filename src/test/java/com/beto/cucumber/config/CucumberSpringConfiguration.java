package com.beto.cucumber.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.beto.cucumber.CucumberApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberApplication.class) 
public class CucumberSpringConfiguration {
}
