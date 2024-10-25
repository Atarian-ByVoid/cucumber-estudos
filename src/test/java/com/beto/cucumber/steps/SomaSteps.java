package com.beto.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest 
public class SomaSteps {
    
    private int numero1;
    private int numero2;
    private int resultado;

    @Given("eu tenho o número {int}")
    public void eu_tenho_o_número(int numero) {
        if (numero1 == 0) {
            numero1 = numero;
        } else {
            numero2 = numero;
        }
    }

    @When("eu somo esses números")
    public void eu_somo_esses_numeros() {
        resultado = numero1 + numero2;
        System.out.println("Qualquer coisa");
    }

    @Then("o resultado deve ser {int}")
    public void o_resultado_deve_ser(int esperado) {
        assertEquals(esperado, resultado);
    }
}
