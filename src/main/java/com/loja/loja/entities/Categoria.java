package com.loja.loja.entities;

import jakarta.persistence.*;

@Entity
@Table()
public class Categoria {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String descricao;
   private boolean ativo;

   public Categoria() {
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public boolean isAtivo() {
      return ativo;
   }

   public void setAtivo(boolean ativo) {
      this.ativo = ativo;
   }
}
