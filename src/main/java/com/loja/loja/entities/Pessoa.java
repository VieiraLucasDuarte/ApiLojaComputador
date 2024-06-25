package com.loja.loja.entities;

import jakarta.persistence.*;

@Entity
@Table()
public class Pessoa {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String login;
   private String senha;
   private String Nome;
   private String CPF;
   private String Celular;
   private String Endereco;
   private String Bairro;
   private String Complemento;

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getSenha() {
      return senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

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
