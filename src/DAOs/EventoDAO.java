/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Dados.ConnectionFactory;
import Entidades.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author thilu
 */
public class EventoDAO {
    public boolean cadastrarEvento(Evento evento) throws Exception {
        String sql = "insert into [dbo].[Evento](IdResponsavel, IdCategoria, Nome, Endereco, Data, Capacidade, Descricao)"
                    +"values(?, ?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement statement = null;
        boolean response = false;
        
        try{
            conn = ConnectionFactory.createConn();
            statement = conn.prepareStatement(sql);
            
            statement.setInt(1, evento.responsavelId);
            statement.setInt(2, evento.categoriaId);
            statement.setString(3, evento.nome);
            statement.setString(4, evento.endereco);
            statement.setDate(5, evento.data);
            statement.setInt(6, evento.capacidade);
            
            statement.execute();
            response = true;
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento"+ex);
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
