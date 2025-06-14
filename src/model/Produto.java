package model;

public class Produto {
   private String nome;
   private double preco;
   private int qtde;
   
   public Produto(String nome, double preco, int qtde) {
	   this.nome = nome;
	   this.preco = preco;
	   this.qtde = qtde;
   }
   
   public void setNome(String nome) {
	   this.nome = nome;
   }
   
   public String getNome() {
	   return nome;
   }
   
   public void setQtde(int qtde) {
	   this.qtde = qtde;
   }
   
   public int getQtde() {
	   return qtde;
   }
   
   public void setPreco(double preco) {
	   this.preco = preco;
   }
   
   public double getPreco() {
	   return preco;
   }
}