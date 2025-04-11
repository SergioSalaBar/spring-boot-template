package es.nextdigital.demo.infraestructure.repository.entity;

import es.nextdigital.demo.domain.molel.TipoCuenta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "cuentas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CuentaEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private String iban;

    private BigDecimal saldo;

    @Enumerated(EnumType.STRING)
    private TipoCuenta tipo;

    private BigDecimal limiteCredito;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private ClienteEntity cliente;
}
