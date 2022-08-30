package com.example.pruebatecnica.models.output;

import com.example.pruebatecnica.entities.Cliente;
import com.example.pruebatecnica.models.BaseOutput;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ClienteResponse extends BaseOutput {
    private Cliente cliente;
    private List<Cliente> clientes;
}
