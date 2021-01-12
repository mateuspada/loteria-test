package com.poupatempo.loteria.api;

import com.poupatempo.loteria.api.request.ClienteRequest;
import com.poupatempo.loteria.api.response.BilheteDeLoteriaResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

// Criação do endpoint /v1/loteria
@RequestMapping("/v1/loteria/bilhete")
public interface LoteriaController {

    @PostMapping
    BilheteDeLoteriaResponse cadastrarBilhete(
            @Valid @RequestBody ClienteRequest clienteRequest
    );

    @GetMapping
    List<BilheteDeLoteriaResponse> obterBilhetes(
            @Valid @RequestBody ClienteRequest clienteRequest
    );


}
