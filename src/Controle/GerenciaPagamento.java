package Controle;

import Banco.PagamentoDAO;
import Model.Pagamento;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciaPagamento {

    private PagamentoDAO pagamentoBD;

    public GerenciaPagamento() {
        pagamentoBD = new PagamentoDAO();
    }

    public boolean cadastrarPagamento(LocalDate data, double valor, int tipo, double juros) {

        Pagamento pag = new Pagamento(data, valor, tipo, juros);
        String result = pagamentoBD.inserirNoBanco(pag);

        return result.equals("sucesso");
    }
}
