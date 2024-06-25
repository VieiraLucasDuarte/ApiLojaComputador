package com.loja.loja.repository;

import com.loja.loja.dto.CompraDTO;
import com.loja.loja.dto.PessoaDTO;
import com.loja.loja.entities.Compra;
import com.loja.loja.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompraRepository extends JpaRepository<Compra, Long> {
}
