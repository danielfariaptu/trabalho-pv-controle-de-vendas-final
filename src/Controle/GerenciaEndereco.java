package Controle;

import Banco.EnderecoDAO;
import Model.Endereco;
import java.util.ArrayList;

public class GerenciaEndereco {

    private EnderecoDAO enderecoBD;

    public GerenciaEndereco() {
        enderecoBD = new EnderecoDAO();
    }
    public boolean cadastrarEndereco(String logradouro, int numero, String complemento, String bairro, String municipio, String estado, int tipoEndereco) {

        Endereco end = new Endereco(logradouro, numero, complemento, bairro, municipio, estado, tipoEndereco);
        String result = enderecoBD.inserirNoBanco(end);

        return result.equals("sucesso");
    }
}
