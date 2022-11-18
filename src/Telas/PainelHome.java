package Telas;


public class PainelHome extends javax.swing.JPanel {
int numPag = 1;

    public PainelHome() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        painelEvento1 = new Telas.PainelEvento();
        painelEvento2 = new Telas.PainelEvento();
        painelEvento3 = new Telas.PainelEvento();
        butVoltar = new javax.swing.JButton();
        butProximo = new javax.swing.JButton();
        labelPage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><body><center> Ponto <br> Cultural </center></body></html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        painelEvento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        painelEvento2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        painelEvento3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        butVoltar.setBackground(new java.awt.Color(204, 0, 51));
        butVoltar.setText("Voltar");
        butVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        butVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVoltarActionPerformed(evt);
            }
        });

        butProximo.setBackground(new java.awt.Color(204, 0, 51));
        butProximo.setText("Próximo");
        butProximo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        butProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butProximoActionPerformed(evt);
            }
        });

        labelPage.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelPage.setText("Página " + Integer.toString(numPag));
        labelPage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(butVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(painelEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(painelEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(painelEvento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPage))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butProximoActionPerformed
        numPag++;
        labelPage.setText("Página " + Integer.toString(numPag));
    }//GEN-LAST:event_butProximoActionPerformed

    private void butVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVoltarActionPerformed
        if(numPag != 1){
            numPag--;
            labelPage.setText("Página " + Integer.toString(numPag));
        }
    }//GEN-LAST:event_butVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butProximo;
    private javax.swing.JButton butVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPage;
    private Telas.PainelEvento painelEvento1;
    private Telas.PainelEvento painelEvento2;
    private Telas.PainelEvento painelEvento3;
    // End of variables declaration//GEN-END:variables
}
