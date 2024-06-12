package com.loja.loja.dto;

public class PessoaDTO {

   private String Nome;
   private String Senha;

   public PessoaDTO(String nome, String senha) {
      Nome = nome;
      Senha = senha;
   }

   public String getSenha() {
      return Senha;
   }

   public void setSenha(String senha) {
      Senha = senha;
   }

   public String getNome() {
      return Nome;
   }

   public void setNome(String nome) {
      Nome = nome;
   }
}
