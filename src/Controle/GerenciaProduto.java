package Controle;

import Banco.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;

public class GerenciaProduto {
ArrayList<Produto> prod = new ArrayList<Produto>();
    private ProdutoDAO produtoBD;

    public GerenciaProduto() {
        produtoBD = new ProdutoDAO();
        
    }

    public boolean cadastrarProduto(String nome, double preco, String codigoBarras, String tipoUva, String paisOrigem, String tipoVinho) {

        Produto pro = new Produto(nome, preco, codigoBarras, tipoUva, paisOrigem, tipoVinho);
        String result = produtoBD.inserirNoBanco(pro);

        return true;
    }

    public boolean alterarProduto(Produto pro) {
        String result = produtoBD.alterarNoBanco(pro);
        return result.equals("sucesso");
    }

    public boolean excluirProduto(String nome) {
        String result = produtoBD.excluirDoBanco(nome);
        return result.equals("sucesso");
    }

    public ArrayList consultarProduto(String nome) {
        ArrayList<Produto> pros = produtoBD.consultarNoBanco(nome);
        return pros;
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

    public Produto acharProduto(int i) {
        Produto p = (Produto) relatorioProduto().get(i);
        return p;
    }
    
    public ArrayList<Produto> getProdutos(){
        return prod;
    }
}
