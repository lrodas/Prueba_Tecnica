package com.example.pruebatecnica.controllers;

import com.example.pruebatecnica.dao.IClienteDao;
import com.example.pruebatecnica.entities.Cliente;
import com.example.pruebatecnica.models.Input.ClienteRequest;
import com.example.pruebatecnica.models.output.ClienteResponse;
import com.example.pruebatecnica.services.IClienteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cliente")
public class ClienteController {

    private Logger LOG = LogManager.getLogger(ClienteController.class);

    private IClienteService clienteService;

    @Autowired
    public ClienteController(IClienteService clienteService){
        this.clienteService = clienteService;
    }

    @Async
    @PostMapping("/save")
    public ListenableFuture<ResponseEntity<ClienteResponse>> guardarCliente(ClienteRequest request) {
        LOG.info("METHOD: guardarCliente() --PARAMS: cliente" + request.getCliente());

        Cliente cliente = request.getCliente();
        ClienteResponse response = new ClienteResponse();

        if (cliente == null) {
            response.setCode(0);
            response.setStatus(false);
            response.setResponse("Se deben enviar los datos del cliente");
        }

        cliente = this.clienteService.save(cliente);

        if (cliente != null) {
            response.setCode(1);
            response.setStatus(true);
            response.setResponse("Cliente Guardado exitosamente");
        } else {
            response.setCode(2);
            response.setStatus(false);
            response.setResponse("Ha ocurrido un problema interno del servidor");
        }
        return new AsyncResult<ResponseEntity<ClienteResponse>>(ResponseEntity.ok(response));
    }

    @Async
    @GetMapping("/findAll")
    public ListenableFuture<ResponseEntity<ClienteResponse>> findAll() {
        LOG.info("METHOD findAll()");
        ClienteResponse response = new ClienteResponse();

        response.setCode(1);
        response.setStatus(true);
        response.setResponse("Consulta exitosa");
        response.setClientes(this.clienteService.findAll());

        return new AsyncResult<>(ResponseEntity.ok(response));
    }


}
