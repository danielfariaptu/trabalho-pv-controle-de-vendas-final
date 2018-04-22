/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class Fatura {
    
    private Conta conta;
    private LocalDate dataQuitacao;
    private double juros;
    private int quantParcelas;
    private ArrayList<Pagamento> parcelas;

    public Fatura(Conta conta, LocalDate dataQuitacao, double juros, int quantParcelas, ArrayList<Pagamento> parcelas) {
        this.conta = conta;
        this.dataQuitacao = dataQuitacao;
        this.juros = juros;
        this.quantParcelas = quantParcelas;
        this.parcelas = parcelas;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public LocalDate getDataQuitacao() {
        return dataQuitacao;
    }

    public void setDataQuitacao(LocalDate dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public int getQuantParcelas() {
        return quantParcelas;
    }

    public void setQuantParcelas(int quantParcelas) {
        this.quantParcelas = quantParcelas;
    }

    public ArrayList<Pagamento> getParcelas() {
        return parcelas;
    }

    public void setParcelas(ArrayList<Pagamento> parcelas) {
        this.parcelas = parcelas;
    }
    
}
