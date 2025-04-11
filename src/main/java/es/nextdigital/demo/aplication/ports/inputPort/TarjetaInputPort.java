package es.nextdigital.demo.aplication.ports.inputPort;

import es.nextdigital.demo.infraestructure.apirest.dto.request.*;
import es.nextdigital.demo.infraestructure.apirest.dto.response.*;

public interface TarjetaInputPort {
    ActivarTarjetaResponse activarTarjeta(ActivarTarjetaRequest request);
    CambiarPinResponse cambiarPinTarjeta(CambiarPinRequest request);
}
