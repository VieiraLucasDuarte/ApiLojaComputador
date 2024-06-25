package com.loja.loja.repository;

import com.loja.loja.dto.PessoaDTO;
import com.loja.loja.entities.Categoria;
import com.loja.loja.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IPessoaRepository extends JpaRepository<Pessoa, Long> {
   Optional<Pessoa> findByLogin(String login);
}
