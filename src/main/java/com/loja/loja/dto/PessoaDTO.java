package com.loja.loja.dto;

public class PessoaDTO {
   private String Nome;
   private String CPF;
   private String Celular;
   private String Endereco;
   private String Bairro;
   private String Complemento;

   public String getNome() {
      return Nome;
   }

   public void setNome(String nome) {
      Nome = nome;
   }

   public String getCPF() {
      return CPF;
   }

   public void setCPF(String CPF) {
      this.CPF = CPF;
   }

   public String getCelular() {
      return Celular;
   }

   public void setCelular(String celular) {
      Celular = celular;
   }

   public String getEndereco() {
      return Endereco;
   }

   public void setEndereco(String endereco) {
      Endereco = endereco;
   }

   public String getBairro() {
      return Bairro;
   }

   public void setBairro(String bairro) {
      Bairro = bairro;
   }

   public String getComplemento() {
      return Complemento;
   }

   public void setComplemento(String complemento) {
      Complemento = complemento;
   }
}
