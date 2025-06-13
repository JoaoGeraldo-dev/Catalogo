package view;

import model.Produto;
import model.ListaProduto;

import javax.swing.JOptionPane;

import model.ListaProduto;
import model.Produto;
public class ProdutoApp {
    public static void main(String[] args) {
        ListaProduto catalogo = new ListaProduto();
        int opcao;

        do {
            String menu = "1. Adicionar produto\n"
                        + "2. Remover produto\n"
                        + "3. Alterar produto\n"
                        + "4. Listar todas os produtos \n"
                        + "5. Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
                    int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde: "));
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));
                    Produto produto = new Produto(nome,preco,qtde);
                    catalogo.addProduto(produto);
                    break;

                case 2:
                   nome = JOptionPane.showInputDialog("digite o nome do produto para remover");
                   if(catalogo.removeProduto(nome)) {
                	   JOptionPane.showInputDialog(null, "Produto Removido com sucesso");
                   }else {
                	   JOptionPane.showInputDialog(null, "ERRO! nome do produto invalido");
                   }
                   break;

                case 3:
                    nome = JOptionPane.showInputDialog("digite o nome do produto para alterar");
                    
                   String nvnome = JOptionPane.showInputDialog("digite o nome do novo produto"); 
                   preco = Double.parseDouble(JOptionPane.showInputDialog("digite o preco do novo produto")); 
                   qtde = Integer.parseInt(JOptionPane.showInputDialog("digite o preco do novo produto"));
                	if(catalogo.alterarProd(nome, nvnome, qtde, preco)) {
                		JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
                	}else {
                		JOptionPane.showMessageDialog(null, "Produto não encontrado");
                	}
                	break;
                   
                case 4:
                  String lista = "";
                  
                  for(Produto prod : catalogo.ListarProdutos()) {
                	  lista = lista	+ prod.getNome() + " R$" + prod.getPreco() + " quantidade:" + prod.getQtde() + "\n";
                  }
                  JOptionPane.showMessageDialog(null, lista.toString());
                  break; 
            }
                  
        } while(opcao != 5);
        
    }
}     
