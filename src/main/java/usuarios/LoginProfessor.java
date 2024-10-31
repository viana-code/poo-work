/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package usuarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class LoginProfessor extends javax.swing.JFrame {

    /**
     * Creates new form LoginProfessor
     */
    public LoginProfessor() {
        initComponents();
    }

    private boolean verificarLogin(String nome, String id) {
    String arquivo = "C:\\Users\\Usuario\\Documents\\Usuarios.txt";  // Caminho do arquivo

    try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
        String linha;
        while ((linha = leitor.readLine()) != null) {
            String[] dados = linha.split(",");  
            String nomeCadastrado = dados[0];
            String idCadastrado = dados[1]; 

            // Verifica se o nome e o ID estão corretos
            if (nomeCadastrado.equals(nome) && idCadastrado.equals(id)) {
                return true; // Login bem-sucedido
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Erro ao verificar os dados: " + e.getMessage());
    }

    return false; // Login falhou
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNomeprof = new javax.swing.JTextField();
        jIdprof = new javax.swing.JTextField();
        jButtonLoginProfessor = new javax.swing.JButton();
        jButtonProfessorVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("ID");

        jNomeprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeprofActionPerformed(evt);
            }
        });

        jButtonLoginProfessor.setText("Login");
        jButtonLoginProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginProfessorActionPerformed(evt);
            }
        });

        jButtonProfessorVoltar.setText("Voltar");
        jButtonProfessorVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfessorVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonProfessorVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonLoginProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addComponent(jNomeprof)
                        .addComponent(jIdprof)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jNomeprof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jIdprof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLoginProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButtonProfessorVoltar)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeprofActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeprofActionPerformed

    private void jButtonProfessorVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfessorVoltarActionPerformed
        new LoginView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonProfessorVoltarActionPerformed

    private void jButtonLoginProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginProfessorActionPerformed
        String nome = jNomeprof.getText();
        String id = jIdprof.getText();
        if(verificarLogin(nome,id)){
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
            new Opcoes().setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Nome ou ID invalidos.");
        }
        
    }//GEN-LAST:event_jButtonLoginProfessorActionPerformed

    
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
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoginProfessor;
    private javax.swing.JButton jButtonProfessorVoltar;
    private javax.swing.JTextField jIdprof;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jNomeprof;
    // End of variables declaration//GEN-END:variables
}
