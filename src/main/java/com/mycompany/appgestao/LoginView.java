/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.appgestao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import usuarios.CadastroAluno;
import usuarios.CadastroProfessor;
import usuarios.LoginAluno;
import usuarios.LoginProfessor;


public class LoginView extends javax.swing.JFrame {

   
    public LoginView() {
        initComponents();
        setTitle("Tela Principal");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAluno = new javax.swing.JButton();
        jButtonProfessor = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jButtonCadastroAluno = new javax.swing.JButton();
        jButtonCadastroProfessor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAluno.setText("Aluno");
        jButtonAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlunoActionPerformed(evt);
            }
        });

        jButtonProfessor.setText("Professor");
        jButtonProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfessorActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        label1.setText("Aplicativo XERECAO");

        jButtonCadastroAluno.setText("Cadastrar Aluno");
        jButtonCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroAlunoActionPerformed(evt);
            }
        });

        jButtonCadastroProfessor.setText("Cadastrar Professor");
        jButtonCadastroProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroProfessorActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastroProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonCadastroAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jButtonAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastroAluno)
                    .addComponent(jButtonCadastroProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfessorActionPerformed
        new LoginProfessor().setVisible(true);
        dispose();        
    }//GEN-LAST:event_jButtonProfessorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCadastroProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroProfessorActionPerformed
       new CadastroProfessor().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonCadastroProfessorActionPerformed

    private void jButtonCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroAlunoActionPerformed
        new CadastroAluno().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastroAlunoActionPerformed

    private void jButtonAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlunoActionPerformed
        new LoginAluno();
        dispose();
    }//GEN-LAST:event_jButtonAlunoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAluno;
    private javax.swing.JButton jButtonCadastroAluno;
    private javax.swing.JButton jButtonCadastroProfessor;
    private javax.swing.JButton jButtonProfessor;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}