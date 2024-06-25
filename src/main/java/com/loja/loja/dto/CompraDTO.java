package com.loja.loja.dto;

public class CompraDTO {
   private int IDProduto;
   private int IDPessoa;
   private float Quantidade;
   private float Valor;

   public int getIDProduto() {
      return IDProduto;
   }

   public void setIDProduto(int IDProduto) {
      this.IDProduto = IDProduto;
   }

   public int getIDPessoa() {
      return IDPessoa;
   }

   public void setIDPessoa(int IDPessoa) {
      this.IDPessoa = IDPessoa;
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
