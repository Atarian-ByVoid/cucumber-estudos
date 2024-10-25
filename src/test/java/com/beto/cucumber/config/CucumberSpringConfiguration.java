package com.beto.cucumber.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.beto.cucumber.CucumberApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberApplication.class) // Substitua pela sua classe principal
public class CucumberSpringConfiguration {
    // Aqui você pode adicionar métodos para configurar beans, se necessário
}
