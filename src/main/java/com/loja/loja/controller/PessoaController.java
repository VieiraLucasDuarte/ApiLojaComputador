package com.loja.loja.controller;

import com.loja.loja.dto.PessoaDTO;
import com.loja.loja.entities.Pessoa;
import com.loja.loja.repository.IPessoaRepository;
import com.loja.loja.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

   @Autowired
   private IPessoaRepository repository;

   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
   public boolean Login(@RequestBody PessoaDTO pessoaDTO) {
      Optional<Pessoa> user = repository.findByUsername(pessoaDTO.getNome());

      if(user.isPresent()) {
         Pessoa pessoa = user.get();
         if(pessoa.getSenha().equals(pessoaDTO.getSenha())) {
            return true;
         } else
            return false;
      } else
         return false;
   }
}
