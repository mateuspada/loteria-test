package com.poupatempo.loteria.repository.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "bilhete")
public class BilheteDeLoteriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bilhete_id", nullable = false)
    private Long id;

    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ClienteEntity clienteEntity;

    @ElementCollection
    @Column(name = "numeros")
    public Set<Integer> numerosDaLoteria;

    public BilheteDeLoteriaEntity() {
    }

    public BilheteDeLoteriaEntity(ClienteEntity clienteEntity, Set<Integer> numerosDaLoteria) {
        this.clienteEntity = clienteEntity;
        this.numerosDaLoteria = numerosDaLoteria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteEntity getClienteEntity() {
        return clienteEntity;
    }

    public void setClienteEntity(ClienteEntity clienteEntity) {
        this.clienteEntity = clienteEntity;
    }

    public Set<Integer> getNumerosDaLoteria() {
        return numerosDaLoteria;
    }

    public void setNumerosDaLoteria(Set<Integer> numerosDaLoteria) {
        this.numerosDaLoteria = numerosDaLoteria;
    }
}