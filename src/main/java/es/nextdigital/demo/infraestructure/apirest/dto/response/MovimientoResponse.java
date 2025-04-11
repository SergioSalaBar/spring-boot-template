package es.nextdigital.demo.infraestructure.apirest.dto.response;

import es.nextdigital.demo.infraestructure.repository.entity.TipoMovimiento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovimientoResponse {
    private LocalDateTime fecha;
    private BigDecimal cantidad;
    private TipoMovimiento tipo;
    private String descripcion;
}
