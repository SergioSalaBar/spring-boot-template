package es.nextdigital.demo.infraestructure.apirest.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultarMovimientosRequest {
    private UUID cuentaId;
}
