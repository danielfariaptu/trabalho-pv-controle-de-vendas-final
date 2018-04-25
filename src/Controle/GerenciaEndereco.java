package Controle;

import Banco.EnderecoDAO;
import Model.Cliente;
import Model.Endereco;
import java.util.ArrayList;
import java.util.Iterator;

public class GerenciaEndereco {

    private EnderecoDAO enderecoBD;

    public GerenciaEndereco() {
        enderecoBD = new EnderecoDAO();
    }

    public boolean cadastrarEndereco(String logradouro, int numero, String cep, String complemento, String bairro, String municipio, String estado, int tipoEndereco) {

        Endereco end = new Endereco(logradouro, numero, cep, complemento, bairro, municipio, estado, tipoEndereco);
        String result = enderecoBD.inserirNoBanco(end);

        return result.equals("sucesso");
    }

    public ArrayList<Endereco> relatorioEnderecos() {
        ArrayList<Endereco> end = enderecoBD.relatorioEndereco();

        return end;
    }

      public Endereco retornaEndereco(String codigoEndereco) {
       //int numero = Integer.parseInt(codigoEndereco);
          /*
        ArrayList<Endereco> end = relatorioEnderecos();
        for (Endereco e : end) {;
            if (e.getCodigo()  == (codigoEndereco)) {
                return e;
            }
        }
        */
        return null;
    }
}
