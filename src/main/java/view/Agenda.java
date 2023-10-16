/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Dell
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
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

        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAgenda = new javax.swing.JButton();
        jScrollObservacoes = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboServico = new javax.swing.JComboBox<>();
        jComboNome = new javax.swing.JComboBox<>();
        jLabelObservacoes = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jLabelServico = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jLabelFundoTelaAgenda = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Maria", "Alongamento", null},
                {"2", "Rilva", "Mão", null},
                {"3", "Brusa", null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Cliente", "Serviço", "Observações"
            }
        ));
        jScrollPaneTabela.setViewportView(jTable1);

        getContentPane().add(jScrollPaneTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 830, 260));

        jButtonAgenda.setText("Agendar");
        jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 230, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollObservacoes.setViewportView(jTextArea1);

        getContentPane().add(jScrollObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 440, 150));

        jComboServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alongamento", "Manutenção", "Pé", "Mão" }));
        jComboServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 180, -1));

        jComboNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maria", "Rilva", "Brusa" }));
        getContentPane().add(jComboNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 180, -1));

        jLabelObservacoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelObservacoes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservacoes.setText("Observações");
        getContentPane().add(jLabelObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

        jLabelHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("Hora");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabelData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Data");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabelValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor R$ :");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabelServico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServico.setText("Serviço");
        getContentPane().add(jLabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Id");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));
        getContentPane().add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 180, -1));
        getContentPane().add(jTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 180, -1));
        getContentPane().add(jTextFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 180, -1));
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 180, -1));

        jLabelFundoTelaAgenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Pictures\\Sistema Esmalteria\\Image\\1234.jpg")); // NOI18N
        getContentPane().add(jLabelFundoTelaAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 1190, 540));

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Pictures\\Sistema Esmalteria\\Image\\Fundo Principal New.jpg")); // NOI18N
        getContentPane().add(jLabelFundoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 1380, 1390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboServicoActionPerformed

    private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JComboBox<String> jComboNome;
    private javax.swing.JComboBox<String> jComboServico;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelFundoTelaAgenda;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelObservacoes;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollObservacoes;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
