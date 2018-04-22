/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class PessoaJuridica extends Cliente{
    
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nomeFantasia, String cnpj, String nome, ArrayList<Endereco> enderecos, double limiteCredito) {
        super(nome, enderecos, limiteCredito);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
