package com.am.gerenciamento_departamentos.Repositories;

import com.am.gerenciamento_departamentos.Model.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<DepartamentoModel, Long> {
}
