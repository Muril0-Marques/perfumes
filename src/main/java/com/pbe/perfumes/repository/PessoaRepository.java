package com.pbe.perfumes.repository;

import com.pbe.perfumes.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}