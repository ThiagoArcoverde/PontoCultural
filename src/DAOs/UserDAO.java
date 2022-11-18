package DAOs;

import Dados.ConnectionFactory;
import Entidades.Login;
import Entidades.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UserDAO {
    public User autenticar(Login login) throws Exception{
        String sql = "select * from Usuario where Email = ? AND Senha = ?";
        
        Connection conn = null;
        PreparedStatement statement = null;
        User response = new User();
        
        try {
            conn = ConnectionFactory.createConn();
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, login.email);
            statement.setString(2, login.senha);
            
            ResultSet result = statement.executeQuery();
            
            while(result.next()) {
                response.id = result.getInt("Id");
                response.cpf = result.getString("CPF");
                response.nome = result.getString("Nome");
                response.email = result.getString("Email");
                response.telefone = result.getString("Telefone");
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado");
        } finally {
            try {
                if (statement != null){
                    statement.close();
                }

                if (conn != null){
                    conn.close();
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro cadastrar, encerrar conexão: "+e);
            }
        }
        return response;
    }
    
    public boolean cadastrar(User usuario) throws Exception {
        String sql = "insert into Usuario(IdCargo, Nome, CPF, Email, Telefone, Senha)"
                    +"values(?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement statement = null;
        boolean response = false;
        
        try{
            conn = ConnectionFactory.createConn();
            statement = conn.prepareStatement(sql);
            
            statement.setInt(1, usuario.cargoId);
            statement.setString(2, usuario.nome);
            statement.setString(3, usuario.cpf);
            statement.setString(4, usuario.email);
            statement.setString(5, usuario.telefone);
            statement.setString(6, usuario.senha);
            
            statement.execute();
            response = true;
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário"+ex);
        } finally {
            try {
                if (statement != null){
                    statement.close();
                }

                if (conn != null){
                    conn.close();
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro cadastrar, encerrar conexão: "+e);
            }
        }
        return response;
    }
}
