package com.projetoAmerico.backendPAS.repository;

import com.projetoAmerico.backendPAS.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
