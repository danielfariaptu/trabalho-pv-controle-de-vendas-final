package Controle;

import Banco.CompraDAO;
import Model.Compra;
import Controle.GerenciaProduto;
import Model.Produto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaCompra {

    private Scanner scn;
    private CompraDAO compraBD;
    private GerenciaProduto gp;

    public GerenciaCompra() {
        scn = new Scanner(System.in);
        compraBD = new CompraDAO();
        gp = new GerenciaProduto();
    }
    
}
