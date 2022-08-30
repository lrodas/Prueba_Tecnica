package com.example.pruebatecnica.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BaseOutput {

    private Integer code;
    private boolean status;
    private String response;
}
