package Controle;

import Banco.CompraDAO;
import Banco.FaturaDAO;
import Model.Compra;
import Controle.GerenciaProduto;
import Model.Conta;
import Model.Fatura;
import Model.Pagamento;
import Model.Produto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GerenciaConta {

    private Scanner scn;
    private FaturaDAO faturaDAO;
    private GerenciaProduto gp;

    public GerenciaConta() {
        scn = new Scanner(System.in);
        faturaDAO = new FaturaDAO();
        gp = new GerenciaProduto();
    }
    
    public void montarFatura(Conta conta, double juros, int parcelas, double valor){
        Fatura fatura = new Fatura(conta, null, juros, parcelas, parcelar(parcelas, juros, valor));
        faturaDAO.criarFatura(fatura, parcelas);
    }
    
    public ArrayList<Pagamento> parcelar(int parcelas, double juros, double valor){
        ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
        
        for (int i = 0; i < parcelas; i++){
            Pagamento pagamento = new Pagamento();
            if(juros > 0){
                pagamento.setJuros(juros/parcelas);
            }else{
                pagamento.setJuros(0);
            }            
            pagamento.setValor(valor);
            pagamento.setData(null);
            
            pagamentos.add(pagamento);
        }
        return pagamentos;
    }
    
    public int comprasStatus(ArrayList<Compra> compras){
        Iterator i = compras.iterator();
        int retorno = 0;
        
        while(i.hasNext()){
            Compra compra = (Compra) i.next();
            if(compra.getStatus() != 0){
                i.remove();
            }else{
                retorno ++;
            }
        }
        return retorno;
    }
    
}
