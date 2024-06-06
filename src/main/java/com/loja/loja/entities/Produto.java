package com.loja.loja.entities;

import jakarta.persistence.*;

@Entity
@Table()
public class Produto {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String Nome;
   private String descricaoCurta;
   private String descricaoLonga;
   private double valor;
   private boolean promocao;
   private int quantidade;

   @ManyToOne()
   @JoinColumn(name = "categoria_id")
   private Categoria categoria;

   public Produto() {
   }

   public String getDescricaoCurta() {
      return descricaoCurta;
   }

   public void setDescricaoCurta(String descricaoCurta) {
      this.descricaoCurta = descricaoCurta;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getDescricaoLonga() {
      return descricaoLonga;
   }

   public void setDescricaoLonga(String descricaoLonga) {
      this.descricaoLonga = descricaoLonga;
   }

   public double getValor() {
      return valor;
   }

   public void setValor(double valor) {
      this.valor = valor;
   }

   public boolean isPromocao() {
      return promocao;
   }

   public void setPromocao(boolean promocao) {
      this.promocao = promocao;
   }

   public int getQuantidade() {
      return quantidade;
   }

   public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
   }

   public String getNome() {
      return Nome;
   }

   public void setNome(String nome) {
      Nome = nome;
   }

   public Categoria getCategoria() {
      return categoria;
   }

   public void setCategoria(Categoria categoria) {
      this.categoria = categoria;
   }

}
