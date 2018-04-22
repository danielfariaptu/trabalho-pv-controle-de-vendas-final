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
public class PessoaFisica extends Cliente {
    
    private String cpf;

    public PessoaFisica(String cpf, String nome, ArrayList<Endereco> enderecos, double limiteCredito) {
        super(nome, enderecos, limiteCredito);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
