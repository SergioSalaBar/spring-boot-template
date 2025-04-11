package es.nextdigital.demo.domain.molel;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movimiento {
    private UUID id;
    private LocalDateTime fecha;
    private BigDecimal cantidad;
    private TipoMovimiento tipo;
    private String descripcion;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
}
