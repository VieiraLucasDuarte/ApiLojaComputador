package com.loja.loja.controller;

import com.loja.loja.entities.Produto;
import com.loja.loja.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

   @Autowired
   private IProdutoRepository repository;


   @GetMapping
   public List<Produto> findProdutos() {
      return repository.findAll();
   }

   @GetMapping("/subcategoria/{idSub}")
   public List<Produto> findBySubCat(@PathVariable int idSub) {
      return repository.findAll().stream()
              .filter(produto -> produto.getCategoria().getSubCategorias().stream()
                      .anyMatch(subCategoria -> subCategoria.getId() == idSub))
              .collect(Collectors.toList());
   }

   @GetMapping("/{idProduto}")
   public Produto getProduto(@PathVariable int idProduto){
      return repository.findAll().stream()
              .filter(produto -> idProduto == produto.getId())
              .findFirst()
              .orElse(null);
   }
}
