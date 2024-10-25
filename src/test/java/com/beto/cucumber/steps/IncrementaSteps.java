package com.beto.cucumber.steps;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SpringBootTest
public class IncrementaSteps {

    private int contator = 0;

@Given("que o valor do contato é {int}")
public void que_oV_vlor_do_contato_e(Integer int1) {
   contator= int1;
}

@When("eu incremento em {int}")
public void eu_incremento_em(Integer int1) {
    contator = contator+ int1;
}
@Then("o valor do contador sera {int}")
public void o_valor_do_contador_sera(Integer int1) {
    System.out.println(int1);
    System.out.println(contator);

}
    
}
