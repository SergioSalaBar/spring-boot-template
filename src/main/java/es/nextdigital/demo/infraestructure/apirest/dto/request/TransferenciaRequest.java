package es.nextdigital.demo.infraestructure.apirest.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferenciaRequest {
    private UUID tarjetaId;
    private String ibanDestino;
    private BigDecimal monto;
}
