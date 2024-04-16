/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package launcher;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author sergio
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        VistaHomeJP frame1 = new VistaHomeJP();
        ShowPanel(frame1);
        
    }
     private void ShowPanel(JPanel p) {

        p.setSize(1540, 850);
        p.setLocation(0, 0);
        cuerpoGame.removeAll();
        cuerpoGame.add(p, BorderLayout.CENTER);
        cuerpoGame.revalidate();
        cuerpoGame.repaint(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoP = new javax.swing.JPanel();
        cuerpoGame = new javax.swing.JPanel();
        FondoJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(14, 77, 144));
        setExtendedState(6);

        FondoP.setBackground(new java.awt.Color(255, 255, 255));
        FondoP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cuerpoGame.setMaximumSize(new java.awt.Dimension(1540, 850));
        cuerpoGame.setMinimumSize(new java.awt.Dimension(1540, 850));

        javax.swing.GroupLayout cuerpoGameLayout = new javax.swing.GroupLayout(cuerpoGame);
        cuerpoGame.setLayout(cuerpoGameLayout);
        cuerpoGameLayout.setHorizontalGroup(
            cuerpoGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        cuerpoGameLayout.setVerticalGroup(
            cuerpoGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        FondoP.add(cuerpoGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        FondoJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBase.png"))); // NOI18N
        FondoJL.setText("jLabel1");
        FondoP.add(FondoJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new principal().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoJL;
    private javax.swing.JPanel FondoP;
    private javax.swing.JPanel cuerpoGame;
    // End of variables declaration//GEN-END:variables
}
