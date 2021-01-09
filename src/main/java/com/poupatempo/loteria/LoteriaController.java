package com.poupatempo.loteria;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

// Criação do endpoint /loteria
@RestController
@RequestMapping("/loteria")
public class LoteriaController {

    // Primeiro endpoint
    @PostMapping
    public BilheteDeLoteria cadastraBilhete(
//            @RequestHeader("x-usuario-abc") String usuario,
//            @RequestParam("usuario-xyz") String usuarioxyz,
            @Valid @RequestBody Cliente cliente
    ) {

//        System.out.println(usuario);
//        System.out.println(usuarioxyz);

        BilheteDeLoteria bilhete = new BilheteDeLoteria();

        // 1. Verificar se cliente já existe (SELECT * FROM Cliente Where Cliente.email = email)
        // 2. Se existe, obter id do cliente -> se não existe, cadastrar cliente.
        // 3. Salvar o bilhete no banco de dados (Cliente + Bilhete)

        return bilhete;
    }

    // 2º Endpoint -
    //bilhete 1 = cliente 1
    //bilhete 2 = cliente 1
    //bilhete 3 = cliente 1
    //bilhete 4 = cliente 1
    //bilhete 5 = cliente 1
    //bilhete 6 = cliente 2
    //bilhete 7 = cliente 2
    //bilhete 8 = cliente 3
    //
    //select * from bilhete where bilhete.id_cliente = 3 order by bilhete.id

}
