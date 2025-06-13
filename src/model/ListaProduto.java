package model;

import java.util.ArrayList;

public class ListaProduto {
    private ArrayList<Produto> produtos;
    
    public ListaProduto() {
    	produtos = new ArrayList<>();
    }
    
    public boolean addProduto(Produto produto) { //declara o metodo 'addProduto' que recebe o objeto produto da Classe Produto e retorna um boolean
    	String nomeP = produto.getNome(); //Obtem o nome passado como argumento por meio da funcao 'getNome()' e armazena na variavel 'nomeP'.
    	if(BuscarProduto(nomeP) == -1) {//Verifica se ja existe um produto com esse nome na lista, usando o metodo 'BuscarProduto'
    									//O metodo buscarProduto retorna -1 caso nao encontre nenhum produto com o mesmo nome.
    		
    		produtos.add(produto);//caso nao encontre ele adiciona um produto ao nosso ArrayList 'produtos'
    		return true; // retorna true para indicar que o produto foi adicionado a lista
    	}else {
    		return false; //retorna false para indicar que o produto ja existia na lista ou nao foi encontrado.
    	}
    }
    
    public boolean removeProduto(String nome) { // declara o metodo remove produto que vai usar o nome como parametro e retorna um boolean
    	int pos = BuscarProduto(nome); // utiliza o metodo BuscarProduto para descobrir o indice atraves do nome fornecido
    								  //O indice é armazenado dentro da posicao pos e caso nao encontre 'BuscarProduto' vai retornar -1.
    	if(pos >= 0) { //verifica se o indice fornecido existe
    		produtos.remove(pos); //remove o produto pelo indice dele
    		return true;//retorna true indicando que o produto foi removido com sucesso 
    	}
    	return false;//retorna false indicando que o produto nao foi encontrado ou a operação falhou e o produto nao foi removido
    }
    
    public ArrayList<Produto> ListarProdutos(){ //declara o metodo "ListarProdutos" que retorna uma lista de objetos do tipo Produto.
    	return produtos; // retorna a lista 'produtos' com todos os produtos armazenados atualmente.
    }
    
  public boolean alterarProd(String nomeNV, String nome, int qtde, double preco) {//Declara o metodo AlterarProd que//
	  								//recebe todos os atributos do produto e o novo nome do produto
	  int pos = BuscarProduto(nome);// utiliza o metodo BuscarProduto para descobrir o indice atraves do nome fornecido
	  if(pos >= 0) {//verifica se o indice fornecido existe
		  produtos.get(pos).setNome(nomeNV);//recebe a pos do produto e baseado nela define um novo nome
		  produtos.get(pos).setPreco(preco);//recebe a pos do produto e baseado nela define um novo preco
		  produtos.get(qtde).setQtde(qtde);//recebe a pos do produto e baseado nela define uma nova qtde 
		  return true; //retorna true caso as alteraçoes tenham dado certo
	  }else {
	  return false;//retorna false caso as alteraçoes tenham falhado
	  }
	 }
 
    

    public int BuscarProduto(String nome) {   //Declara o método 'BuscarProduto' que recebe uma string 'nome' e retorna um inteiro.
    										  //esse inteiro é a posição do produto que eu busco.
    	int i =0;
    	for(Produto produto: produtos) { //percorre todos os meus objetos 'produto' dentro da minha arraylist 'produtos'.
    		if(produto.getNome().equals(nome)) { //verifica se o nome do produto atual é igual ao passado como parametro.
    			return i;// se ele encontrar o nome, retorna o indice correspondente do produto na lista.
    		}
    		 i++; //Se o nome digitado não for igual , incrementa o indice para verificar o proximo item da lista
    		 //até achar algum que seja igual
    	}
    	return -1;//vai retornar -1 caso percorra a lista inteira e nao ache nenhum nome igual ao digitado.
    }
    
}
