package com.loja.loja.repository;

import com.loja.loja.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {
}
