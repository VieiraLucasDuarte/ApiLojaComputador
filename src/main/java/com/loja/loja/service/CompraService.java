package com.loja.loja.service;

import com.loja.loja.dto.CompraDTO;
import com.loja.loja.entities.Compra;
import com.loja.loja.repository.ICompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

   @Autowired
   private ICompraRepository compraRepository;

   public Compra createCompra(CompraDTO compraDTO) {
      Compra compra = new Compra();
      compra.setIdProduto(compraDTO.getIDProduto());
      compra.setIdPessoa(compraDTO.getIDPessoa());
      compra.setQuantidade(compraDTO.getQuantidade());
      compra.setValor(compraDTO.getValor());
      return compraRepository.save(compra);
   }

}
