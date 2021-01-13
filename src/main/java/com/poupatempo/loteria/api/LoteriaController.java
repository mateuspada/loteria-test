package com.poupatempo.loteria.api;

import com.poupatempo.loteria.api.request.ClienteRequest;
import com.poupatempo.loteria.api.response.BilheteDeLoteriaResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

// Criação do endpoint /v1/loteria
@RequestMapping("/v1/loteria/bilhete")
public interface LoteriaController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    BilheteDeLoteriaResponse cadastrarBilhete(
            @Valid @RequestBody ClienteRequest clienteRequest
    );

    @GetMapping
    ResponseEntity<List<BilheteDeLoteriaResponse>> obterBilhetes(
            @Valid @RequestBody ClienteRequest clienteRequest
    );


}
