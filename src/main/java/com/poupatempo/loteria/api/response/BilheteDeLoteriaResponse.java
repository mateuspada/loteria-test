package com.poupatempo.loteria.api.response;

import java.util.Set;

public class BilheteDeLoteriaResponse {
    private Set<Integer> numerosDaLoteria;

    public BilheteDeLoteriaResponse(Set<Integer> numerosDaLoteria) {
        this.numerosDaLoteria = numerosDaLoteria;
    }

    public Set<Integer> getNumerosDaLoteria() {
        return numerosDaLoteria;
    }
}
