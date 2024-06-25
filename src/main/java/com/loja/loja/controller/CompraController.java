package com.loja.loja.controller;

import com.loja.loja.dto.CompraDTO;
import com.loja.loja.dto.UsuarioDTO;
import com.loja.loja.entities.Compra;
import com.loja.loja.repository.ICompraRepository;
import com.loja.loja.repository.IPessoaRepository;
import com.loja.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/compra")
public class CompraController {

   //@Autowired
   //rivate ICompraRepository repository;

   @Autowired
   private CompraService service;

   @PostMapping("/login")
   @ResponseStatus(HttpStatus.CREATED)
   public Compra CreatedCompra(@RequestBody CompraDTO compraDTO) {
      return service.createCompra(compraDTO);
   }
}
