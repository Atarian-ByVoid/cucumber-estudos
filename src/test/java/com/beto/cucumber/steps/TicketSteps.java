package com.beto.cucumber.steps;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.java.en.Given;

@SpringBootTest
public class TicketSteps {

    @Given("que o ticket é {string}")
    public void que_o_ticket_é_af345(String ticket) {

    }

    @Given("que o valor da passagem é R$ {double}")
    public void que_o_valor_da_passagem_é_r$(Double passagem) {

    }

    @Given("que o nome do passageiro é {string}")
    public void que_o_nome_do_passageiro_é(String nomePassageiro) {

    }

    @Given("que o telefone do passageiro é {string}")
    public void que_o_telefone_do_passageiro_é(String telefone) {

    }

    @Given("que o ticket especial é {string}")
    public void que_o_ticket_especial_é(String string) {
    }

}
