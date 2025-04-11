package es.nextdigital.demo.aplication.ports.inputPort;

import es.nextdigital.demo.infraestructure.apirest.dto.request.*;
import es.nextdigital.demo.infraestructure.apirest.dto.response.*;

import java.util.UUID;

public interface MovimientoInputPort {

    Object consultarMovimientos(UUID cuentaId);

    Object retirarEfectivo(OperacionResponse request);

    Object ingresarEfectivo(OperacionResponse request);

    Object realizarTransferencia(TransferenciaRequest request);
}
