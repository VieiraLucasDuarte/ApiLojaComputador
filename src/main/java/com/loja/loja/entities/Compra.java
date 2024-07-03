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

   @OneToMany(cascade =  CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
   @JoinColumn(name = "produto_id")
   private List<Produto> produtos;
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

}
