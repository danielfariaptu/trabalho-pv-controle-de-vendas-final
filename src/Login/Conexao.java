/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author matheus
 */
public class Conexao {
    
     public static Connection getConexao() {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Properties prop= new Properties();
			prop.put("user", "postgres");
			prop.put("password", "123321");
			prop.put("charset", "UTF-8");
			prop.put("lc_type", "ISO8859_1");
			
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/tavv",prop);
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Erro: "+e.getMessage());
			return null;
		}
	}
    
}
