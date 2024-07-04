package com.loja.loja.dto;

public class PessoaDTO {
   private long id;
   private String nome;
   private String cpf;
   private String celular;
   private String endereco;
   private String bairro;
   private String complemento;

   public long getId() {
      return id;
   }

   public void setId(long id) {
      id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      nome = nome;
   }

   public String getCPF() {
      return cpf;
   }

   public void setCPF(String CPF) {
      this.cpf = CPF;
   }

   public String getCelular() {
      return celular;
   }

   public void setCelular(String celular) {
      celular = celular;
   }

   public String getEndereco() {
      return endereco;
   }

   public void setEndereco(String endereco) {
      endereco = endereco;
   }

   public String getBairro() {
      return bairro;
   }

   public void setBairro(String bairro) {
      bairro = bairro;
   }

   public String getComplemento() {
      return complemento;
   }

   public void setComplemento(String complemento) {
      complemento = complemento;
   }
}
