package es.nextdigital.demo.domain.molel;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    private UUID id;
    private String nombre;
    private String documentoIdentidad;
    private List<Cuenta> cuentas;
}
