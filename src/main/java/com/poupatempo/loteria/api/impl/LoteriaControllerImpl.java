package com.poupatempo.loteria.api.impl;

import com.poupatempo.loteria.api.LoteriaController;
import com.poupatempo.loteria.api.request.ClienteRequest;
import com.poupatempo.loteria.api.response.BilheteDeLoteriaResponse;
import com.poupatempo.loteria.service.LoteriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class LoteriaControllerImpl implements LoteriaController {

    private LoteriaService loteriaService;

    public LoteriaControllerImpl(LoteriaService loteriaService) {
        this.loteriaService = loteriaService;
    }

    @Override
    public BilheteDeLoteriaResponse cadastrarBilhete(ClienteRequest clienteRequest) {
        return loteriaService.cadastrarBilhete(clienteRequest.toCliente()).toBilheteDeLoteriaResponse(clienteRequest.getEmail());
    }

    @Override
    public ResponseEntity<List<BilheteDeLoteriaResponse>> obterBilhetes(ClienteRequest clienteRequest) {

        try {
            return new ResponseEntity<>(loteriaService.obterBilhetes(clienteRequest.toCliente()).stream()
                    .map(it -> it.toBilheteDeLoteriaResponse(clienteRequest.getEmail()))
                    .collect(Collectors.toList()),
                    HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
