package com.poupatempo.loteria.api.impl;

import com.poupatempo.loteria.api.LoteriaController;
import com.poupatempo.loteria.api.request.ClienteRequest;
import com.poupatempo.loteria.api.response.BilheteDeLoteriaResponse;
import com.poupatempo.loteria.service.LoteriaService;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class LoteriaControllerImpl implements LoteriaController {

    private LoteriaService loteriaService;

    public LoteriaControllerImpl(LoteriaService loteriaService) {
        this.loteriaService = loteriaService;
    }

    @Override
    public BilheteDeLoteriaResponse cadastrarBilhete(ClienteRequest clienteRequest) {
        return loteriaService.cadastrarBilhete(clienteRequest.toCliente()).toBilheteDeLoteriaResponse();
    }

    @Override
    public List<BilheteDeLoteriaResponse> obterBilhetes(@Valid ClienteRequest clienteRequest) {

        loteriaService.obterBilhetes(clienteRequest.toCliente());

        return null;
    }
}
