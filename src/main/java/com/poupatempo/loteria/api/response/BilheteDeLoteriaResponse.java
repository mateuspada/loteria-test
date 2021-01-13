package com.poupatempo.loteria.api.response;

public class BilheteDeLoteriaResponse {
    private Long id;
    private String email;
    private String numeros;

    public BilheteDeLoteriaResponse(Long id, String email, String numeros) {
        this.id = id;
        this.email = email;
        this.numeros = numeros;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeros() {
        return numeros;
    }
}
