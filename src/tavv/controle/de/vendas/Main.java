package tavv.controle.de.vendas;

import Interface.Login.Login;
import javax.swing.JFrame;

public class Main { 

 public static void main(String[] args) {
         Login lg = new Login ();
              	lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                lg.setSize(640, 516);
		lg.setVisible(true);
 
    }

} 


