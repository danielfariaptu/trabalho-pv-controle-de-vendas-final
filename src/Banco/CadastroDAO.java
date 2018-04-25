package Banco;

import Banco.Conexao;
import Criptografia.BCrypt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Interface.Login.Login;
import tavv.controle.de.vendas.MenuPrincipal;

public class CadastroDAO {

    private PreparedStatement statement;
    private ResultSet resultSet;
    private BCrypt BCrypt;
    private Integer cont = 1;
    private Boolean verificaSenha;
    private Connection conn;
    
    public CadastroDAO() {
              conn= Conexao.getConexao();


    }

    public Boolean CadastroUser(String nome, String senhaHasheada) {

        try {
            
            String url = "INSERT INTO usuario (nome, senha) VALUES(?,?)";
            statement = conn.prepareStatement(url);
            statement.setString(1, nome);
            statement.setString(2, senhaHasheada);
            statement.execute();
            statement.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");
            return (true);

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Usuário com o mesmo username foi encontrado! \nUsuário: " + nome, "Usuário Existente", JOptionPane.ERROR_MESSAGE);
            return (false);

        }

    }

}
