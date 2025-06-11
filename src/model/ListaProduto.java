package model;

import java.util.ArrayList;

public class ListaProduto {
    private ArrayList<Produto> produtos;

    public ListaProduto() {
        produtos = new ArrayList<>();
    }

    public boolean addProduto(Produto produto) {
    	String nomeP = produto.getNome() ;
    	if (buscarProduto(nomeP) == -1) {
    		produtos.add(produto);
    		return true;
    	} else {
    		return false;
    	}
    }

    public boolean removeProduto(String nome) {
        int posicao = buscarProduto(nome);
        if (posicao >= 0) {
            produtos.remove(posicao);
            return true;
        }
        return false;
    }
    
    public int buscarProduto(String nome) {
    	int i = 0;
    	for (Produto produto : produtos) {
    		if (produto.getNome().equals(nome)) {
    			return i;
    		}
    		i++;
    	}
    	return -1;
    }
    
    public ArrayList<Produto> listarProdutos() {
    	return produtos;
    }
    
    public boolean alterarProduto(String nome, String novoNome, int qtt, double preco) {
    	int posicao = buscarProduto(nome);
    	if (posicao >= 0) {
    		produtos.get(posicao).setNome(novoNome);
    		produtos.get(posicao).setQtt(qtt);
    		produtos.get(posicao).setPreco(preco);
    		
    		return true;
    	} else {
    		return false;
    	}
    }
}
