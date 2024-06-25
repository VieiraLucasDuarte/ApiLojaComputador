package com.loja.loja.dto;

public class UsuarioDTO {

   private String Login;
   private String Senha;

   public UsuarioDTO(String login, String senha) {
      Login = login;
      Senha = senha;
   }

   public String getSenha() {
      return Senha;
   }

   public void setSenha(String senha) {
      Senha = senha;
   }

   public String getLogin() {
      return Login;
   }

   public void setLogin(String login) {
      Login = login;
   }
}
