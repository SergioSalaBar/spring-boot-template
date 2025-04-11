package es.nextdigital.demo.infraestructure.apirest.controller;

import es.nextdigital.demo.aplication.ports.inputPort.MovimientoInputPort;
import es.nextdigital.demo.aplication.ports.inputPort.TarjetaInputPort;
import es.nextdigital.demo.infraestructure.apirest.dto.request.*;
import es.nextdigital.demo.infraestructure.apirest.dto.response.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/cajero")
@RequiredArgsConstructor
@Tag(name = "Operaciones de Cajero", description = "Endpoints para operaciones bancarias desde cajeros automáticos")
public class MovimientosController {

    private final MovimientoInputPort movimientoService;
    private final TarjetaInputPort tarjetaService;

    @Operation(summary = "Consultar movimientos de cuenta")
    @GetMapping("/cuentas/{cuentaId}/movimientos")
    public ResponseEntity<ConsultarMovimientosResponse> consultarMovimientos(
            @PathVariable UUID cuentaId) {
        return ResponseEntity.ok((ConsultarMovimientosResponse) movimientoService.consultarMovimientos(cuentaId));
    }

    @Operation(summary = "Retirar efectivo")
    @PostMapping("/retiros")
    public <RetirarEfectivoRequest> ResponseEntity<OperacionResponse> retirarEfectivo(
            @RequestBody RetirarEfectivoRequest request) {
        return ResponseEntity.ok((OperacionResponse) movimientoService.retirarEfectivo((OperacionResponse) request));
    }

    @Operation(summary = "Ingresar efectivo")
    @PostMapping("/ingresos")
    public <IngresarEfectivoRequest> ResponseEntity<OperacionResponse> ingresarEfectivo(
            @RequestBody IngresarEfectivoRequest request) {
        return ResponseEntity.ok((OperacionResponse) movimientoService.ingresarEfectivo((OperacionResponse) request));
    }

    @Operation(summary = "Realizar transferencia")
    @PostMapping("/transferencias")
    public ResponseEntity<OperacionResponse> realizarTransferencia(
            @RequestBody @Valid TransferenciaRequest request) {
        return ResponseEntity.ok((OperacionResponse) movimientoService.realizarTransferencia(request));
    }

    @Operation(summary = "Activar tarjeta")
    @PostMapping("/tarjetas/activacion")
    public ResponseEntity<ActivarTarjetaResponse> activarTarjeta(
            @RequestBody @Valid ActivarTarjetaRequest request) {
        return ResponseEntity.ok(tarjetaService.activarTarjeta(request));
    }

    @Operation(summary = "Cambiar PIN de tarjeta")
    @PutMapping("/tarjetas/pin")
    public ResponseEntity<CambiarPinResponse> cambiarPinTarjeta(
            @RequestBody @Valid CambiarPinRequest request) {
        return ResponseEntity.ok(tarjetaService.cambiarPinTarjeta(request));
    }
}
