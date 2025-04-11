package es.nextdigital.demo.infraestructure.apirest.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SacarDineroRequest {
    private UUID tarjetaId;
    private BigDecimal monto;
    private UUID cajeroId;
}
