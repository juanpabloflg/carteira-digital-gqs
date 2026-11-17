package com.example.bdd;

import com.example.CarteiraDigital;
import io.cucumber.java.pt.*;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class CarteiraSteps {

    private CarteiraDigital carteira;
    private IllegalArgumentException erro;

    @Dado("uma carteira com saldo de {int} reais")
    public void criarCarteira(int saldoInicial) {
        carteira = new CarteiraDigital();
        erro = null;

        if (saldoInicial > 0) {
            carteira.depositar(BigDecimal.valueOf(saldoInicial));
        }
    }

    @Quando("deposito {int} reais")
    public void depositar(int valor) {
        carteira.depositar(BigDecimal.valueOf(valor));
    }

    @Quando("pago {int} reais")
    public void pagar(int valor) {
        carteira.pagar(BigDecimal.valueOf(valor));
    }

    @Quando("tento pagar {int} reais")
    public void tentarPagar(int valor) {
        try {
            carteira.pagar(BigDecimal.valueOf(valor));
        } catch (IllegalArgumentException e) {
            erro = e;
        }
    }

    @Então("o pagamento deve ser recusado")
    public void verificarRecusa() {
        assertNotNull(erro, "O pagamento deveria ser recusado.");
        assertEquals("Saldo insuficiente.", erro.getMessage());
    }

    @Então("o saldo deve ser de {int} reais")
    public void verificarSaldo(int esperado) {
        assertEquals(
            0,
            carteira.consultarSaldo()
                .compareTo(BigDecimal.valueOf(esperado))
        );
    }
}