/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_grafica;
import clase_de_dados.Piloto;
import arquivo_de_dados.PilotoDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kai
 */
public class Tabela extends javax.swing.JFrame {
    private static DefaultTableModel Model;
    private  PilotoDAO DAO;
    
    /**
     * Creates new form Tabela
     */
    public Tabela() {
        initComponents();
        Model =(DefaultTableModel)jTable2.getModel();
        
    }

    private void popularTabela(Iterator pilotos) {
    try {
            Model.setNumRows(0);
            DAO= new PilotoDAO();
            Model.setNumRows(0);
            Iterator it =pilotos;
            while (it.hasNext()) {                
                Piloto piloto = (Piloto) it.next();
                Model.addRow(new Object[]{piloto.getCodigo(),piloto.getNome(),piloto.getPais(),piloto.getIdade(),piloto.getEquipe(),piloto.getMotor(),piloto.getPontos()});
            }
        } catch (Exception e) {
            System.err.println("asdasd"+e); 
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BTNarray = new javax.swing.JButton();
        BTNpilha = new javax.swing.JButton();
        BTNfila = new javax.swing.JButton();
        BTNarrayI = new javax.swing.JButton();
        BTNpilhaI = new javax.swing.JButton();
        BTNfilaI = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Pais", "Idade", "Equipe", "Motor", "Pontos"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        BTNarray.setText("ArrayLS");
        BTNarray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNarrayActionPerformed(evt);
            }
        });

        BTNpilha.setText("Pilha");
        BTNpilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNpilhaActionPerformed(evt);
            }
        });

        BTNfila.setText("Fila");
        BTNfila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNfilaActionPerformed(evt);
            }
        });

        BTNarrayI.setText("ArrayLS");
        BTNarrayI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNarrayIActionPerformed(evt);
            }
        });

        BTNpilhaI.setText("Pilha");
        BTNpilhaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNpilhaIActionPerformed(evt);
            }
        });

        BTNfilaI.setText("Fila");
        BTNfilaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNfilaIActionPerformed(evt);
            }
        });

        jLabel1.setText("Normal");

        jLabel2.setText("Iterator");

        jButton1.setText("Set");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTNarrayI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTNpilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTNarray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTNfila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTNpilhaI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTNfilaI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(BTNarray)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNpilha)
                        .addGap(18, 18, 18)
                        .addComponent(BTNfila)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNarrayI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNpilhaI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNfilaI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNarrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNarrayActionPerformed
        try {
            Model.setNumRows(0); 
            DAO= new PilotoDAO();
            for(Piloto piloto:DAO.ConsultarTodos()){ 
           
             Model.addRow(new Object[]{piloto.getCodigo(),piloto.getNome(),piloto.getPais(),piloto.getIdade(),piloto.getEquipe(),piloto.getMotor(),piloto.getPontos()});
       
            }
        
        
        
        
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_BTNarrayActionPerformed

    private void BTNpilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNpilhaActionPerformed
        try {
           Model.setNumRows(0);
            DAO=new PilotoDAO();
            for (Object p:DAO.ExibirListaPilha()) {
                Piloto pilo = (Piloto)p;
                 Model.addRow(new Object[]{pilo.getCodigo(),pilo.getNome(),pilo.getPais(),pilo.getIdade(),pilo.getEquipe(),pilo.getMotor(),pilo.getPontos()});
            }
        } catch (Exception e) {
        }


         
    }//GEN-LAST:event_BTNpilhaActionPerformed

    private void BTNfilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNfilaActionPerformed
         try {
             Model.setNumRows(0);
             DAO= new PilotoDAO();
            for(Piloto piloto:DAO.ExibirLista()){ 
           
             Model.addRow(new Object[]{piloto.getCodigo(),piloto.getNome(),piloto.getPais(),piloto.getIdade(),piloto.getEquipe(),piloto.getMotor(),piloto.getPontos()});
       
            }
        
        
        
        
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BTNfilaActionPerformed

    private void BTNarrayIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNarrayIActionPerformed
        DAO = new PilotoDAO();
        try {
            popularTabela(DAO.ConsultarTodosIterador());
        } catch (Exception ex) {
            Logger.getLogger(Tabela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNarrayIActionPerformed

    private void BTNpilhaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNpilhaIActionPerformed
        DAO = new PilotoDAO();
        try {
            popularTabela(DAO.ExibirListaPilhaIterator());
        } catch (Exception ex) {
            Logger.getLogger(Tabela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNpilhaIActionPerformed

    private void BTNfilaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNfilaIActionPerformed
       DAO = new PilotoDAO();
        try {
            popularTabela(DAO.ExibirFilaIterador());
        } catch (Exception ex) {
            Logger.getLogger(Tabela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNfilaIActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             DAO = new PilotoDAO();
        try {
            popularTabela(DAO.ExibirSetIterator());
        } catch (Exception ex) {
            Logger.getLogger(Tabela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNarray;
    private javax.swing.JButton BTNarrayI;
    private javax.swing.JButton BTNfila;
    private javax.swing.JButton BTNfilaI;
    private javax.swing.JButton BTNpilha;
    private javax.swing.JButton BTNpilhaI;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
