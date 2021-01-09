package com.poupatempo.loteria;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class Cliente {

    @NotNull(message = "E-mail precisa ser preenchido")
    @Email(message = "E-mail inválido")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
