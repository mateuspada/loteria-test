package com.poupatempo.loteria.service.impl;

import com.poupatempo.loteria.repository.BilheteDeLoteriaRepository;
import com.poupatempo.loteria.repository.ClienteRepository;
import com.poupatempo.loteria.repository.entity.BilheteDeLoteriaEntity;
import com.poupatempo.loteria.repository.entity.ClienteEntity;
import com.poupatempo.loteria.service.LoteriaService;
import com.poupatempo.loteria.service.model.BilheteDeLoteria;
import com.poupatempo.loteria.service.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoteriaServiceImpl implements LoteriaService {

    private ClienteRepository clienteRepository;
    private BilheteDeLoteriaRepository bilheteDeLoteriaRepository;

    public LoteriaServiceImpl(ClienteRepository clienteRepository,
                              BilheteDeLoteriaRepository bilheteDeLoteriaRepository) {
        this.clienteRepository = clienteRepository;
        this.bilheteDeLoteriaRepository = bilheteDeLoteriaRepository;
    }

    @Override
    public BilheteDeLoteria cadastrarBilhete(Cliente cliente) {

        // Procurando cliente por e-mail
        ClienteEntity clienteEntity = clienteRepository.findByEmail(cliente.getEmail())
                // Se não existir, então salva o cliente
                .orElseGet(() -> clienteRepository.save(cliente.toClienteEntity()));

        // Gerando um novo bilhete de loteria
        BilheteDeLoteria bilheteDeLoteria = new BilheteDeLoteria();

        // Salvando o bilhete
        bilheteDeLoteriaRepository.save(bilheteDeLoteria.toBilheteDeLoteriaEntity(clienteEntity));

        return bilheteDeLoteria;
    }

    @Override
    public List<BilheteDeLoteria> obterBilhetes(Cliente cliente) {

        // Procurando cliente por e-mail
        ClienteEntity clienteEntity = clienteRepository.findByEmail(cliente.getEmail())
                // Se não existir, então salva o cliente
                .orElseThrow(() -> new RuntimeException("Cliente nao existe"));

        List<BilheteDeLoteriaEntity> bilheteDeLoteriaEntities = bilheteDeLoteriaRepository.findAllByClienteEntity(clienteEntity);



        List<BilheteDeLoteria> listaDeBilhetes

        return null;
    }
}
