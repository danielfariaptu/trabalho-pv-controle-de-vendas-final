package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;


public class CalculaJuros {
    private double juros;
    
    private LocalDate hoje = LocalDate.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public CalculaJuros() {
        
    }
    
    public double calculaJurosPorAtraso(double valor, LocalDate dataVencimento){
        long diferencaEmDias = ChronoUnit.DAYS.between(hoje, dataVencimento);
        if(diferencaEmDias > 1){
            juros = diferencaEmDias * 0.23333333333333334;
            juros = valor * (juros/100);
        }
        return juros;
    }
    public double calculaJurosPorParcelamento(double valor, int parcelas){
        if(parcelas > 1){
            juros = valor * ((7*parcelas)*0.01);
        }else{
            return 0;
        }
        return juros;
    }
}
