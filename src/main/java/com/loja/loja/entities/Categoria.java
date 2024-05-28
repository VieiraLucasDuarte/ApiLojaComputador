package com.loja.loja.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table()
public class Categoria {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String descricao;
   private boolean ativo;

   @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
   @JoinColumn(name = "categoria_id")
   private List<SubCategoria> subCategorias;
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

   public List<SubCategoria> getSubCategorias() {
      return subCategorias;
   }

   public void setSubCategorias(List<SubCategoria> subCategorias) {
      this.subCategorias = subCategorias;
   }
}
