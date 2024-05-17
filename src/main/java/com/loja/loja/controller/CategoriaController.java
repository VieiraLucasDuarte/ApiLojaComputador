package com.loja.loja.controller;

import com.loja.loja.entities.Categoria;
import com.loja.loja.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

   @Autowired
   private ICategoriaRepository repository;


   @GetMapping
   public List<Categoria> findAll() {
      return repository.findAll();
   }

}
