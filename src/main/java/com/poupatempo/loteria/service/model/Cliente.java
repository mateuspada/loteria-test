package com.poupatempo.loteria.service.model;

import com.poupatempo.loteria.repository.entity.ClienteEntity;

public class Cliente {

    private String email;

    public Cliente(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public ClienteEntity toClienteEntity() {
        return new ClienteEntity(this.email);
    }
}
