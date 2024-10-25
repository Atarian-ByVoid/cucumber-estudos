package com.beto.cucumber.config;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // feature do cucumber
    glue = {"com.beto.cucumber.steps", "com.beto.cucumber.config"},  // Aponta para a classe e as config dos testes
    plugin = {"pretty", "html:target/cucumber-reports"}, // Embeleza o console
    snippets = SnippetType.UNDERSCORE, // Metodos anotados em camel ou snake
    monochrome = true, // Arrumar o console
    dryRun = true // Nao deixa pular nenhum passo
    )
public class CucumberTestRunner {
}
