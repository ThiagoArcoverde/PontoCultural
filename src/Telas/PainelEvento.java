/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Telas;

/**
 *
 * @author thilu
 */
public class PainelEvento extends javax.swing.JPanel {

    /**
     * Creates new form PainelEvento
     */
    public PainelEvento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelName = new javax.swing.JLabel();
        labelDesc = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        labelName.setBackground(new java.awt.Color(255, 255, 255));
        labelName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelName.setText("Evento Nome");

        labelDesc.setBackground(new java.awt.Color(255, 255, 255));
        labelDesc.setText("Evento Desc");

        labelData.setBackground(new java.awt.Color(255, 255, 255));
        labelData.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelData.setText("Evento Data");

        labelEndereco.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelEndereco.setText("Evento Endereço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(labelData))
                    .addComponent(labelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(labelData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEndereco)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelName;
    // End of variables declaration//GEN-END:variables
}
