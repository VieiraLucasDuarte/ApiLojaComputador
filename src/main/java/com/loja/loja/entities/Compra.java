package com.loja.loja.entities;

import java.util.List;

import com.loja.loja.dto.CompraDTO;
import jakarta.persistence.*;

@Entity
@Table()
public class Compra {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long ID;
   private long IdProduto;
   private long IdPessoa;
   private float Quantidade;
   private float Valor;

   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "IdPessoa", referencedColumnName = "id", insertable = false, updatable = false)
   private Pessoa pessoa;

   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "idProduto", referencedColumnName = "id", insertable = false, updatable = false)
   private Produto produto;

   public Compra() {
   }

   public long getID() {
      return ID;
   }

   public void setID(long ID) {
      this.ID = ID;
   }

   public long getIdProduto() {
      return IdProduto;
   }

   public void setIdProduto(long idProduto) {
      IdProduto = idProduto;
   }

   public long getIdPessoa() {
      return IdPessoa;
   }

   public void setIdPessoa(long idPessoa) {
      IdPessoa = idPessoa;
   }

   public float getQuantidade() {
      return Quantidade;
   }

   public void setQuantidade(float quantidade) {
      Quantidade = quantidade;
   }

   public float getValor() {
      return Valor;
   }

   public void setValor(float valor) {
      Valor = valor;
   }

   public Pessoa getPessoa() {
      return pessoa;
   }

   public void setPessoa(Pessoa pessoa) {
      this.pessoa = pessoa;
   }

   public Produto getProduto() {
      return produto;
   }

   public void setProduto(Produto produto) {
      this.produto = produto;
   }
}
