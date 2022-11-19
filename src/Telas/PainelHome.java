package Telas;

import Entidades.Evento;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.List;
import javax.swing.JOptionPane;


public class PainelHome extends javax.swing.JPanel {
int numPag = 1;

    public List<Evento> listagemDeEventos;
    public PainelHome() {
        initComponents();
    }
    
    public PainelHome(List<Evento> listaEventos) {
        this.listagemDeEventos = listaEventos;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        painelEvento1 = new Telas.PainelEvento(this.listagemDeEventos.get(0));
        painelEvento2 = new Telas.PainelEvento(this.listagemDeEventos.get(1));
        painelEvento3 = new Telas.PainelEvento(this.listagemDeEventos.get(2));

        setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><body><center> Ponto <br> Cultural </center></body></html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        painelEvento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelEvento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelEvento1MouseClicked(evt);
            }
        });

        painelEvento2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelEvento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelEvento2MouseClicked(evt);
            }
        });

        painelEvento3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelEvento3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelEvento3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelEvento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(painelEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelEvento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void painelEvento1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelEvento1MouseClicked
        Evento event = new Evento();
        event = listagemDeEventos.get(0);
        JOptionPane.showMessageDialog(null, "Descrição: " + event.descricao + "\n\nEndereço: " + event.endereco + "\nData: " + event.data.toString(), event.nome, HEIGHT);
    }//GEN-LAST:event_painelEvento1MouseClicked

    private void painelEvento2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelEvento2MouseClicked
        Evento event = new Evento();
        event = listagemDeEventos.get(1);
        JOptionPane.showMessageDialog(null, "Descrição: " + event.descricao + "\n\nEndereço: " + event.endereco + "\nData: " + event.data.toString(), event.nome, HEIGHT);
    }//GEN-LAST:event_painelEvento2MouseClicked

    private void painelEvento3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelEvento3MouseClicked
        Evento event = new Evento();
        event = listagemDeEventos.get(2);
        JOptionPane.showMessageDialog(null, "Descrição: " + event.descricao + "\n\nEndereço: " + event.endereco + "\nData: " + event.data.toString(), event.nome, HEIGHT);
    }//GEN-LAST:event_painelEvento3MouseClicked

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private Telas.PainelEvento painelEvento1;
    private Telas.PainelEvento painelEvento2;
    private Telas.PainelEvento painelEvento3;
    // End of variables declaration//GEN-END:variables
}
