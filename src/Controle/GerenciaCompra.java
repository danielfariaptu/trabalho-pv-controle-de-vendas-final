package Controle;

import Banco.CompraDAO;
import Model.Compra;
import Controle.GerenciaProduto;
import Model.Produto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GerenciaCompra {

    private Scanner scn;
    private CompraDAO compraDAO;
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
    
    public void finalizarCompra(Compra compra, int id){
        compraDAO.realizarCompra(compra, id);
    }
    
}
