/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Dados.ConnectionFactory;
import Entidades.Evento;
import Entidades.Login;
import Entidades.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author thilu
 */
public class EventoDAO {
    public boolean cadastrarEvento(Evento evento) throws Exception {
        String sql = "insert into Evento(IdResponsavel, Nome, Endereco, Data, Capacidade, Descricao)"
                    +"values(?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement statement = null;
        boolean response = false;
        
        try{
            conn = ConnectionFactory.createConn();
            statement = conn.prepareStatement(sql);
            
            statement.setInt(1, evento.responsavelId);
            statement.setString(2, evento.nome);
            statement.setString(3, evento.endereco);
            statement.setDate(4,  new java.sql.Date(System.currentTimeMillis()));
            statement.setInt(5, evento.capacidade);
            statement.setString(6, evento.descricao);
            
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
    public List<Evento> buscarEventos() throws Exception{
        String sql = "select * from evento ORDER BY Data DESC";
        
        Connection conn = null;
        PreparedStatement statement = null;
        Evento response = new Evento();
        List<Evento> listagemEvento = new ArrayList<Evento>();  ;
        
        try {
            conn = ConnectionFactory.createConn();
            statement = conn.prepareStatement(sql);
            
            ResultSet result = statement.executeQuery();
            
            while(result.next()) {
                response.id = result.getInt("Id");
                response.responsavelId = result.getInt("IdResponsavel");
                response.nome = result.getString("Nome");
                response.endereco = result.getString("Endereco");
                response.data = result.getDate("Data");
                response.capacidade = result.getInt("Capacidade");
                response.descricao = result.getString("Descricao");
                
                listagemEvento.add(response);
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Evento não encontrado");
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
        return listagemEvento;
    }
}
