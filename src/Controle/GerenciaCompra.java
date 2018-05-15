package Controle;

import Banco.CompraDAO;
import Banco.ContaDAO;
import Model.Compra;
import Controle.GerenciaProduto;
import Model.Conta;
import Model.Fatura;
import Model.Pagamento;
import Model.Produto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GerenciaCompra {

    private Scanner scn;
    private CompraDAO compraDAO;
    private ContaDAO contaDAO;
    private GerenciaProduto gp;

    public GerenciaCompra() {
        scn = new Scanner(System.in);
        compraDAO = new CompraDAO();
        gp = new GerenciaProduto();
    }
    public double getTotal(ArrayList<Produto> carrinho){
        Iterator i = carrinho.iterator();
        double total = 0;
        
        while(i.hasNext()){
            Produto produto = (Produto) i.next();
            total += produto.getPreco();
        }
        return total;
    }
    
    public double getTotalCompras(ArrayList<Compra> compras){
        Iterator i = compras.iterator();
        double total = 0;
        
        while(i.hasNext()){
            Compra compra = (Compra) i.next();
            total += getTotal(compra.getProdutos());
        }
        return total;
    }
    public double getTotalComprasFatura(ArrayList<Compra> compras){
        Iterator i = compras.iterator();
        double total = 0;
        
        while(i.hasNext()){
            Compra compra = (Compra) i.next();
            total += getTotal(compra.getProdutos());
        }
        return total;
    }
    
     public double getTotalComprasAbertas(ArrayList<Compra> compras){
        Iterator i = compras.iterator();
        double total = 0;
        
        while(i.hasNext()){
            Compra compra = (Compra) i.next();
            if(compra.getStatus() == 0){
                total += getTotal(compra.getProdutos());
            }            
        }
        return total;
    }
     public Conta getConta(int idCliente){
         return contaDAO.buscarConta(idCliente);
     }
    
    public void finalizarCompra(Compra compra, int id){
        compraDAO.realizarCompra(compra, id);
    }
    
}
