package com.example;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarteiraDigitalTest {

    @Test
    void deveDepositarCemEmCarteiraZerada() {
        CarteiraDigital carteira = new CarteiraDigital();

        assertEquals(0, carteira.consultarSaldo()
                .compareTo(BigDecimal.ZERO));

        carteira.depositar(new BigDecimal("100.00"));

        assertEquals(0, carteira.consultarSaldo()
                .compareTo(new BigDecimal("100.00")));
    }

    @Test
    void devePagarQuarentaESobrarSessenta() {
        CarteiraDigital carteira = new CarteiraDigital();
        carteira.depositar(new BigDecimal("100.00"));

        carteira.pagar(new BigDecimal("40.00"));

        assertEquals(0, carteira.consultarSaldo()
                .compareTo(new BigDecimal("60.00")));
    }

    @Test
    void deveRecusarPagamentoMaiorQueSaldoEPreservarSaldo() {
        CarteiraDigital carteira = new CarteiraDigital();
        carteira.depositar(new BigDecimal("100.00"));

        assertThrows(
                IllegalArgumentException.class,
                () -> carteira.pagar(new BigDecimal("120.00")));

        assertEquals(0, carteira.consultarSaldo()
                .compareTo(new BigDecimal("100.00")));
    }
}