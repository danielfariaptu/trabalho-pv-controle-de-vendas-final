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
public class Compra {

private ArrayList<Produto> produtos;
private double total;
private LocalDate data;

    public Compra(ArrayList<Produto> produtos, double total, LocalDate data) {
        this.produtos = produtos;
        this.total = total;
        this.data = data;
    }
    
    public Compra(){
    
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
}
