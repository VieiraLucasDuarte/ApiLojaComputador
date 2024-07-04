package com.loja.loja.controller;

import com.loja.loja.dto.PessoaDTO;
import com.loja.loja.dto.UsuarioDTO;
import com.loja.loja.entities.Pessoa;
import com.loja.loja.repository.IPessoaRepository;
import com.loja.loja.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {
   @Autowired
   private PessoaService service;

   @PostMapping("/login")
   @ResponseStatus(HttpStatus.CREATED)
   public Pessoa Login(@RequestBody UsuarioDTO pessoaDTO) {
      Optional<Pessoa> user = service.VerificarPessoa(pessoaDTO);

      if(user.isPresent()) {
         Pessoa pessoa = user.get();
         if(pessoa.getSenha().equals(pessoaDTO.getSenha())) {
            return pessoa;
         } else
            return null;
      } else
         return null;
   }

   @PostMapping("/criar")
   @ResponseStatus(HttpStatus.CREATED)
   public Pessoa CreatedPessoa(@RequestBody PessoaDTO pessoaDTO) {
      return service.CreatedPessoa(pessoaDTO);
   }
}
