package org.example.cati.model.cliente.repositories;

import org.example.cati.model.cliente.Cliente;
import org.example.cati.model.cliente.dto.ClienteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente getById(Long id);
    Optional<Cliente> findById(Long id);
    List<ClienteDTO> findAllBy();
}
