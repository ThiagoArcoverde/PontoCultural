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
                response.cargoId = result.getInt("IdCargo");
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado");
        }
        return response;
    }
}
