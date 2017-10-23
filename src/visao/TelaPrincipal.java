package visao;

import modeloConection.ConexaoBD;

/**
 *
 * @author Roberth
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    ConexaoBD conecta = new ConexaoBD();

    
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuCadFilmes = new javax.swing.JMenuItem();
        jMenuCadSeries = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemPesquisar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenutemRelatorioFilmes = new javax.swing.JMenuItem();
        jMenutemRelatorioSeries = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sonic");
        getContentPane().setLayout(null);

        jLabelPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/filmes_logo.jpg"))); // NOI18N
        getContentPane().add(jLabelPrincipal);
        jLabelPrincipal.setBounds(0, 0, 920, 530);

        jMenuCadastro.setText("Cadastro");

        jMenuCadFilmes.setText("Filmes");
        jMenuCadFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadFilmesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuCadFilmes);

        jMenuCadSeries.setText("Series");
        jMenuCadSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadSeriesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuCadSeries);

        jMenuBar1.add(jMenuCadastro);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemPesquisar.setText("Pesquisar");
        jMenuFerramentas.add(jMenuItemPesquisar);

        jMenu2.setText("Relatorio");

        jMenutemRelatorioFilmes.setText("Filmes");
        jMenutemRelatorioFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenutemRelatorioFilmesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenutemRelatorioFilmes);

        jMenutemRelatorioSeries.setText("Series");
        jMenutemRelatorioSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenutemRelatorioSeriesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenutemRelatorioSeries);

        jMenuFerramentas.add(jMenu2);

        jMenuBar1.add(jMenuFerramentas);

        jMenu1.setText("Opções");

        jMenuAjuda.setText("Ajuda");
        jMenu1.add(jMenuAjuda);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(940, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadFilmesActionPerformed
       CadastroFilmes obj = new CadastroFilmes();
       
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuCadFilmesActionPerformed

    private void jMenuCadSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadSeriesActionPerformed
        CadastroSeries obj = new CadastroSeries();
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuCadSeriesActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenutemRelatorioFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenutemRelatorioFilmesActionPerformed
     //  RelatorioFilmes obj = new RelatorioFilmes();
       //obj.setVisible(true);  
    }//GEN-LAST:event_jMenutemRelatorioFilmesActionPerformed

    private void jMenutemRelatorioSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenutemRelatorioSeriesActionPerformed
       RelatorioSeries obj = new RelatorioSeries ();
       obj.setVisible(true);
    }//GEN-LAST:event_jMenutemRelatorioSeriesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadFilmes;
    private javax.swing.JMenuItem jMenuCadSeries;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemPesquisar;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenuItem jMenutemRelatorioFilmes;
    private javax.swing.JMenuItem jMenutemRelatorioSeries;
    // End of variables declaration//GEN-END:variables
}
