package com.example.pruebatecnica.models.Input;

import com.example.pruebatecnica.entities.Cliente;
import com.example.pruebatecnica.models.BaseInput;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteRequest extends BaseInput {
    private Cliente cliente;
}
