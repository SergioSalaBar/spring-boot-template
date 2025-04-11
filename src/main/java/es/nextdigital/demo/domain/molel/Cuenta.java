package es.nextdigital.demo.domain.molel;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cuenta {
    private UUID id;
    private String iban;
    private BigDecimal saldo;
    private TipoCuenta tipo;
    private BigDecimal limiteCredito;
    private Cliente cliente;

    public boolean puedeRetirar(BigDecimal monto) {
        if (tipo == TipoCuenta.DEBITO) {
            return saldo.compareTo(monto) >= 0;
        } else if (tipo == TipoCuenta.CREDITO) {
            return saldo.add(limiteCredito).compareTo(monto) >= 0;
        }
        return false;
    }

    public void retirar(BigDecimal monto) {
        if (!puedeRetirar(monto)) {
            throw new IllegalArgumentException("Fondos insuficientes.");
        }
        this.saldo = this.saldo.subtract(monto);
    }

    public void ingresar(BigDecimal monto) {
        this.saldo = this.saldo.add(monto);
    }
}