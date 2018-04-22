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
public class Conta {
    
    private ArrayList<Compra> compras;
    private LocalDate dataVencimento;
    private double total;
    private Cliente cliente;

    public Conta(ArrayList<Compra> compras, LocalDate dataVencimento, double total, Cliente cliente) {
        this.compras = compras;
        this.dataVencimento = dataVencimento;
        this.total = total;
        this.cliente = cliente;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }  
    
}
