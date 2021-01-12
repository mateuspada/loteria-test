package com.poupatempo.loteria.api.request;

import com.poupatempo.loteria.service.model.Cliente;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ClienteRequest {

    @NotNull(message = "E-mail precisa ser preenchido")
    @NotBlank(message = "E-mail precisa ser preenchido")
    @Email(message = "E-mail inválido")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente toCliente() {
        return new Cliente(this.email);
    }
}
