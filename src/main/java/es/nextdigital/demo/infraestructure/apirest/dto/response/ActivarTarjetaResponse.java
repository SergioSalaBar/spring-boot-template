package es.nextdigital.demo.infraestructure.apirest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ActivarTarjetaResponse {
    private String mensaje;
    private boolean activada;
}
