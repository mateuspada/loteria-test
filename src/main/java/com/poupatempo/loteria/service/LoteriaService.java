package com.poupatempo.loteria.service;

import com.poupatempo.loteria.service.model.BilheteDeLoteria;
import com.poupatempo.loteria.service.model.Cliente;

import java.util.List;

public interface LoteriaService {

    BilheteDeLoteria cadastrarBilhete(Cliente cliente);

    List<BilheteDeLoteria> obterBilhetes(Cliente cliente);

}
