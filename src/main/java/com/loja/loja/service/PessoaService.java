package com.loja.loja.service;

import com.loja.loja.dto.PessoaDTO;
import com.loja.loja.entities.Pessoa;
import com.loja.loja.repository.ICompraRepository;
import com.loja.loja.repository.IPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
   @Autowired
   private IPessoaRepository pessoaRepository;

   public Pessoa CreatedPessoa(PessoaDTO pessoaDTO) {
      Pessoa pessoa = new Pessoa();
      pessoa.setId(pessoaDTO.getId());
      pessoa.setNome(pessoaDTO.getNome());
      pessoa.setCPF(pessoaDTO.getCPF());
      pessoa.setCelular(pessoaDTO.getCelular());
      pessoa.setEndereco(pessoaDTO.getEndereco());
      pessoa.setBairro(pessoaDTO.getBairro());
      pessoa.setComplemento(pessoaDTO.getComplemento());
      return pessoaRepository.save(pessoa);
   }
}
