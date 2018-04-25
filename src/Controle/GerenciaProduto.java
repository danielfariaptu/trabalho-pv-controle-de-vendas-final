package Controle;

import Banco.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;
import java.util.Iterator;

public class GerenciaProduto {
ArrayList<Produto> prod = new ArrayList<Produto>();
    private ProdutoDAO produtoBD;

    public GerenciaProduto() {
        produtoBD = new ProdutoDAO();
        
    }

    public void cadastrarProduto(String nome, double preco, int estoque, String codigoBarras, String tipoUva, String paisOrigem, String tipoVinho) {

        Produto pro = new Produto(nome, preco,estoque ,codigoBarras, tipoUva, paisOrigem, tipoVinho);
        produtoBD.inserirNoBanco(pro);

    }

    public void alterarProduto(Produto produto) {
        
    }

    public boolean excluirProduto(String nome) {
        String result = produtoBD.excluirDoBanco(nome);
        return result.equals("sucesso");
    }

    public void consultarProduto(String nome) {
        /*
        ArrayList<Produto> pros = produtoBD.consultarNoBanco(nome);
        return pros;*/
    }

    public ArrayList relatorioProduto() {
        ArrayList<Produto> pros = produtoBD.relatorioProduto();
        return pros;
    }

    public Produto retornaProduto(String nomeProduto) {
        ArrayList<Produto> pros = relatorioProduto();
        for (Produto p : pros) {;
            if (p.getNome() == (nomeProduto)) {
                return p;
            }
        }

        return null;
    }

    public int getNroProdutos() {
        return relatorioProduto().size();
    }

    public Produto acharProduto(String id) {
        Produto produto = null;
        ArrayList<Produto> produtos = produtoBD.relatorioProduto();
        Iterator i = produtos.iterator();
        while(i.hasNext()){
            produto = (Produto) i.next();
            if(id.equals(produto.getCodigoBarras())){
                return produto;
            }
        }
        return produto;
    }
    
    public ArrayList<Produto> getProdutos(){
        return prod;
    }
}
