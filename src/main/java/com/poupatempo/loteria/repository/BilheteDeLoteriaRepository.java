package com.poupatempo.loteria.repository;

import com.poupatempo.loteria.repository.entity.BilheteDeLoteriaEntity;
import com.poupatempo.loteria.repository.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BilheteDeLoteriaRepository extends JpaRepository<BilheteDeLoteriaEntity, Long> {

    List<BilheteDeLoteriaEntity> findAllByClienteEntity(ClienteEntity clienteEntity);

}
