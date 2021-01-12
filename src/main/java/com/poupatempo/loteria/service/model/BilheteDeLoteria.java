package com.poupatempo.loteria.service.model;

import com.poupatempo.loteria.api.response.BilheteDeLoteriaResponse;
import com.poupatempo.loteria.repository.entity.BilheteDeLoteriaEntity;
import com.poupatempo.loteria.repository.entity.ClienteEntity;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class BilheteDeLoteria {
    private Set<Integer> numerosDaLoteria;

    //Construtor
    public BilheteDeLoteria() {
        this.numerosDaLoteria = gerarBilhete();
    }

    public Set<Integer> getNumerosDaLoteria() {
        return numerosDaLoteria;
    }

    private Set<Integer> gerarBilhete() {
        Set<Integer> numeros = new TreeSet();

        Random rand = new Random();
        //Vamos sortear 6 números de 0 até 60 sem repetição
        while (numeros.size() < 6) {
            numeros.add(rand.nextInt(59) + 1);
        }

        return numeros;
    }

    public BilheteDeLoteriaResponse toBilheteDeLoteriaResponse() {
        return new BilheteDeLoteriaResponse(this.numerosDaLoteria);
    }

    public BilheteDeLoteriaEntity toBilheteDeLoteriaEntity(ClienteEntity clienteEntity) {
        return new BilheteDeLoteriaEntity(clienteEntity, this.numerosDaLoteria);
    }
}
