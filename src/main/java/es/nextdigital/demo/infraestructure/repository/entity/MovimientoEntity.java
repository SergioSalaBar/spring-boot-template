package es.nextdigital.demo.infraestructure.repository.entity;

import es.nextdigital.demo.domain.molel.TipoMovimiento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "movimientos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovimientoEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private LocalDateTime fecha;

    private BigDecimal cantidad;

    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo;

    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cuenta_origen_id")
    private CuentaEntity cuentaOrigen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cuenta_destino_id")
    private CuentaEntity cuentaDestino;
}
