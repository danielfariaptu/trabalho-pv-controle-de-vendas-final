package Interface;

import java.util.InputMismatchException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class Validador {

    public static boolean isCpf(String cpf) {
        if (cpf.equals("00000000000") || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")
                || (cpf.length() != 11)) {
            return false;
        }

        char dig10, dig11;
        int soma, result, peso, num;
        try {
            soma = 0;
            peso = 10;
            for (int i = 0; i < 9; i++) {
                num = (int) (cpf.charAt(i) - 48);
                soma = soma + (num * peso);
                peso = peso - 1;
            }

            result = 11 - (soma % 11);
            if ((result == 10) || (result == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (result + 48);
            }

            soma = 0;
            peso = 11;

            for (int i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                soma = soma + (num * peso);
                peso = peso - 1;
            }

            result = 11 - (soma % 11);
            if ((result == 10) || (result == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (result + 48);
            }

            return (dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10));
        } catch (InputMismatchException e) {
            return false;
        }
    }

    public static boolean isCharNumber(char c) {
        String num = "0123456789";
        return num.contains(c + "");
    }

    public static boolean isNumber(String num) {
        char[] aux = num.toCharArray();
        boolean result = true;

        for (int i = 0; i < aux.length; i++) {
            if (!(aux[i] >= '0' && aux[i] <= '9')) {
                result = false;
                break;
            }
        }
        return result;
    }

}
