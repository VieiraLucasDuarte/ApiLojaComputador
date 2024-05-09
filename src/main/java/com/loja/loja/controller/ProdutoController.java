package com.loja.loja.controller;

import com.loja.loja.entities.Produto;
import com.loja.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

   @Autowired
   private ProdutoRepository repository;


   @GetMapping
   public List<Produto> findAll() {
      return repository.findAll();
   }
}
