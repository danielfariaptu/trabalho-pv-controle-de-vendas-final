/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author matheus
 */
public class Produto {
    
    private String nome;
    private double preco;
    private String codigoBarras;
    private String tipoUva;
    private String paisOrigem;
    private String tipoVinho;

    public Produto(String nome, double preco, String codigoBarras, String tipoUva, String paisOrigem, String tipoVinho) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
        this.tipoUva = tipoUva;
        this.paisOrigem = paisOrigem;
        this.tipoVinho = tipoVinho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getTipoUva() {
        return tipoUva;
    }

    public void setTipoUva(String tipoUva) {
        this.tipoUva = tipoUva;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getTipoVinho() {
        return tipoVinho;
    }

    public void setTipoVinho(String tipoVinho) {
        this.tipoVinho = tipoVinho;
    }
 
}
