/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package launcher;

/**
 *
 * @author Sergio SM
 */
public class VistaHomeJP extends javax.swing.JPanel {

    /**
     * Creates new form VistaHomeJP
     */
    public VistaHomeJP() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RescateBtn1 = new javax.swing.JButton();
        RescateBtn = new javax.swing.JButton();
        TipologíaBtn = new javax.swing.JButton();
        ProtocolBtn = new javax.swing.JButton();
        ManiobrasBtn = new javax.swing.JButton();
        SeñalizaciónBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(10, 38, 72));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1540, 850));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RescateBtn1.setBackground(new java.awt.Color(0, 0, 0));
        RescateBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Embarque.png"))); // NOI18N
        RescateBtn1.setContentAreaFilled(false);
        RescateBtn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Embarque.png"))); // NOI18N
        RescateBtn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Embarque2.png"))); // NOI18N
        RescateBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RescateBtn1MouseExited(evt);
            }
        });
        add(RescateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 400, 310));

        RescateBtn.setBackground(new java.awt.Color(0, 0, 0));
        RescateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rescate.png"))); // NOI18N
        RescateBtn.setContentAreaFilled(false);
        RescateBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rescate.png"))); // NOI18N
        RescateBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rescate2.png"))); // NOI18N
        RescateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RescateBtnMouseExited(evt);
            }
        });
        add(RescateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 400, 310));

        TipologíaBtn.setBackground(new java.awt.Color(182, 225, 255));
        TipologíaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tipología.png"))); // NOI18N
        TipologíaBtn.setContentAreaFilled(false);
        TipologíaBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tipología.png"))); // NOI18N
        TipologíaBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tipologia2.png"))); // NOI18N
        add(TipologíaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 400, 310));

        ProtocolBtn.setBackground(new java.awt.Color(182, 225, 255));
        ProtocolBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Protocolo.png"))); // NOI18N
        ProtocolBtn.setContentAreaFilled(false);
        ProtocolBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Protocolo.png"))); // NOI18N
        ProtocolBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Protocolo2.png"))); // NOI18N
        ProtocolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProtocolBtnActionPerformed(evt);
            }
        });
        add(ProtocolBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 410, 320));

        ManiobrasBtn.setBackground(new java.awt.Color(182, 225, 255));
        ManiobrasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Maniobras.png"))); // NOI18N
        ManiobrasBtn.setContentAreaFilled(false);
        ManiobrasBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Maniobras.png"))); // NOI18N
        ManiobrasBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Maniobras2.png"))); // NOI18N
        ManiobrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManiobrasBtnActionPerformed(evt);
            }
        });
        add(ManiobrasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 400, 320));

        SeñalizaciónBtn.setBackground(new java.awt.Color(182, 225, 255));
        SeñalizaciónBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Señalizaciónj.png"))); // NOI18N
        SeñalizaciónBtn.setContentAreaFilled(false);
        SeñalizaciónBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Señalizaciónj.png"))); // NOI18N
        SeñalizaciónBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Señalizacion2.png"))); // NOI18N
        SeñalizaciónBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeñalizaciónBtnActionPerformed(evt);
            }
        });
        add(SeñalizaciónBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 430, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void ProtocolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProtocolBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProtocolBtnActionPerformed

    private void ManiobrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManiobrasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManiobrasBtnActionPerformed

    private void SeñalizaciónBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeñalizaciónBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeñalizaciónBtnActionPerformed

    private void RescateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RescateBtnMouseExited

    }//GEN-LAST:event_RescateBtnMouseExited

    private void RescateBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RescateBtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_RescateBtn1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManiobrasBtn;
    private javax.swing.JButton ProtocolBtn;
    private javax.swing.JButton RescateBtn;
    private javax.swing.JButton RescateBtn1;
    private javax.swing.JButton SeñalizaciónBtn;
    private javax.swing.JButton TipologíaBtn;
    // End of variables declaration//GEN-END:variables
}
