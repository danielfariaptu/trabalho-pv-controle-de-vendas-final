package Controle;

import Banco.FaturaDAO;
import Model.Compra;
import Model.Conta;
import Model.Fatura;
import Model.Pagamento;
import java.util.ArrayList;
import java.util.Iterator;

public class GerenciaConta {

    private FaturaDAO faturaDAO;
    private GerenciaProduto gp;

    public GerenciaConta() {

        faturaDAO = new FaturaDAO();
        gp = new GerenciaProduto();
    }

    public void montarFatura(Conta conta, double juros, int parcelas, double valor) {
        Fatura fatura = new Fatura(conta, null, juros, parcelas, parcelar(parcelas, juros, valor));
        fatura.setTotal(valor);
        faturaDAO.criarFatura(fatura, conta.getId());
    }

    public ArrayList<Pagamento> parcelar(int parcelas, double juros, double valor) {
        ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

        for (int i = 0; i < parcelas; i++) {
            Pagamento pagamento = new Pagamento();
            if (juros > 0) {
                pagamento.setJuros(juros / parcelas);
            } else {
                pagamento.setJuros(0);
            }
            pagamento.setValor(valor);
            pagamento.setData(null);

            pagamentos.add(pagamento);
        }
        return pagamentos;
    }

    public ArrayList<Compra> comprasStatus(ArrayList<Compra> compras) {
        ArrayList<Compra> comprasNew = new ArrayList<Compra>();
        Iterator i = compras.iterator();
        int retorno = 0;

        while (i.hasNext()) {
            Compra compra = (Compra) i.next();
            if (compra.getStatus() == 0) {
                comprasNew.add(compra);
            }
        }
        return comprasNew;
    }

    public ArrayList<Fatura> buscarFaturas(Conta conta) {
        ArrayList<Fatura> faturas = faturaDAO.buscarFaturas(conta);
        Iterator i = faturas.iterator();
        while (i.hasNext()) {
            Fatura fatura = (Fatura) i.next();
            fatura.setConta(conta);
        }
        return faturas;
    }

    public void pagarParcela(int idParcela, Fatura fatura) {
        faturaDAO.pagarParcela(idParcela, fatura);
    }

    public Double totalComprasStatus(ArrayList<Compra> compras) {
        double total = 0;
        Iterator i = compras.iterator();

        while (i.hasNext()) {
            Compra compra = (Compra) i.next();
            if (compra.getStatus() == 0) {
                total += compra.getTotal();
            }
        }
        return total;
    }

}
