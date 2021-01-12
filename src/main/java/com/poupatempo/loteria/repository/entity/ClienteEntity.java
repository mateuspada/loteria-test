package com.poupatempo.loteria.repository.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id", nullable = false)
    private Long id;

    @NotNull(message = "Email não pode ser nulo")
    @NotEmpty(message = "Email não pode ser vazio")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteEntity", fetch = FetchType.EAGER)
    private List<BilheteDeLoteriaEntity> bilheteDeLoteriaEntities;

    public ClienteEntity() {
    }

    public ClienteEntity(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BilheteDeLoteriaEntity> getBilheteDeLoteriaEntities() {
        return bilheteDeLoteriaEntities;
    }

    public void setBilheteDeLoteriaEntities(List<BilheteDeLoteriaEntity> bilheteDeLoteriaEntities) {
        this.bilheteDeLoteriaEntities = bilheteDeLoteriaEntities;
    }
}
