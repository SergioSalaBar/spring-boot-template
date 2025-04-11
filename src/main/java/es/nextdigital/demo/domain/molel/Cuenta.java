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
