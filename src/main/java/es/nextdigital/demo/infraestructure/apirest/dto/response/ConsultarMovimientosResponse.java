package es.nextdigital.demo.infraestructure.apirest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConsultarMovimientosResponse {
    private UUID cuentaId;
    private List<MovimientoResponse> movimientos;
}
