import java.math.BigDecimal;

public class CarteiraDigital {

    private BigDecimal saldo = BigDecimal.ZERO;

    public void depositar(BigDecimal valor) {
        validarValor(valor);
        saldo = saldo.add(valor);
    }

    public void pagar(BigDecimal valor) {
        validarValor(valor);

        if (valor.compareTo(saldo) > 0) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }

        saldo = saldo.subtract(valor);
    }

    public BigDecimal consultarSaldo() {
        return saldo;
    }

    private void validarValor(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                "O valor deve ser maior que zero."
            );
        }
    }
}