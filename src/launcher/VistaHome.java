/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package launcher;

import utilidades.Utility;

/**
 *
 * @author Sergio SM
 */
public class VistaHome extends javax.swing.JPanel {

    /**
     * Creates new form VistaHomeJP
     */
    public VistaHome() {
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

        vistaHome = new javax.swing.JPanel();
        RescateBtn1 = new javax.swing.JButton();
        RescateBtn = new javax.swing.JButton();
        TipologíaBtn = new javax.swing.JButton();
        ProtocolBtn = new javax.swing.JButton();
        ManiobrasBtn = new javax.swing.JButton();
        SeñalizaciónBtn = new javax.swing.JButton();
        transaparente = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(1540, 850));
        setMinimumSize(new java.awt.Dimension(1540, 850));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1540, 850));
        setVerifyInputWhenFocusTarget(false);

        vistaHome.setBackground(new java.awt.Color(10, 38, 72));
        vistaHome.setMaximumSize(new java.awt.Dimension(1540, 850));
        vistaHome.setMinimumSize(new java.awt.Dimension(1540, 850));
        vistaHome.setPreferredSize(new java.awt.Dimension(1540, 850));
        vistaHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RescateBtn1.setBackground(new java.awt.Color(0, 0, 0));
        RescateBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Embarque.png"))); // NOI18N
        RescateBtn1.setContentAreaFilled(false);
        RescateBtn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Embarque.png"))); // NOI18N
        RescateBtn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Embarque2.png"))); // NOI18N
        RescateBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RescateBtn1MouseClicked(evt);
            }
        });
        vistaHome.add(RescateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 400, 310));

        RescateBtn.setBackground(new java.awt.Color(0, 0, 0));
        RescateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rescate.png"))); // NOI18N
        RescateBtn.setContentAreaFilled(false);
        RescateBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rescate.png"))); // NOI18N
        RescateBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rescate2.png"))); // NOI18N
        RescateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RescateBtnMouseClicked(evt);
            }
        });
        vistaHome.add(RescateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 400, 310));

        TipologíaBtn.setBackground(new java.awt.Color(182, 225, 255));
        TipologíaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tipología.png"))); // NOI18N
        TipologíaBtn.setContentAreaFilled(false);
        TipologíaBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tipología.png"))); // NOI18N
        TipologíaBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tipologia2.png"))); // NOI18N
        TipologíaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TipologíaBtnMouseClicked(evt);
            }
        });
        vistaHome.add(TipologíaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 400, 310));

        ProtocolBtn.setBackground(new java.awt.Color(182, 225, 255));
        ProtocolBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Protocolo.png"))); // NOI18N
        ProtocolBtn.setContentAreaFilled(false);
        ProtocolBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Protocolo.png"))); // NOI18N
        ProtocolBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Protocolo2.png"))); // NOI18N
        ProtocolBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProtocolBtnMouseClicked(evt);
            }
        });
        vistaHome.add(ProtocolBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 410, 320));

        ManiobrasBtn.setBackground(new java.awt.Color(182, 225, 255));
        ManiobrasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Maniobras.png"))); // NOI18N
        ManiobrasBtn.setContentAreaFilled(false);
        ManiobrasBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Maniobras.png"))); // NOI18N
        ManiobrasBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Maniobras2.png"))); // NOI18N
        ManiobrasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManiobrasBtnMouseClicked(evt);
            }
        });
        vistaHome.add(ManiobrasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 400, 320));

        SeñalizaciónBtn.setBackground(new java.awt.Color(182, 225, 255));
        SeñalizaciónBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Señalizaciónj.png"))); // NOI18N
        SeñalizaciónBtn.setContentAreaFilled(false);
        SeñalizaciónBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Señalizaciónj.png"))); // NOI18N
        SeñalizaciónBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Señalizacion2.png"))); // NOI18N
        SeñalizaciónBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeñalizaciónBtnMouseClicked(evt);
            }
        });
        vistaHome.add(SeñalizaciónBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 430, 310));

        transaparente.setMaximumSize(new java.awt.Dimension(1540, 850));
        transaparente.setMinimumSize(new java.awt.Dimension(1540, 850));
        transaparente.setOpaque(false);
        transaparente.setPreferredSize(new java.awt.Dimension(1540, 850));

        javax.swing.GroupLayout transaparenteLayout = new javax.swing.GroupLayout(transaparente);
        transaparente.setLayout(transaparenteLayout);
        transaparenteLayout.setHorizontalGroup(
            transaparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        transaparenteLayout.setVerticalGroup(
            transaparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistaHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(transaparente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistaHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(transaparente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RescateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RescateBtnMouseClicked
        launcherGame(1);

    }//GEN-LAST:event_RescateBtnMouseClicked

    private void RescateBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RescateBtn1MouseClicked
        launcherGame(2);
    }//GEN-LAST:event_RescateBtn1MouseClicked

    private void TipologíaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipologíaBtnMouseClicked
        launcherGame(3);
    }//GEN-LAST:event_TipologíaBtnMouseClicked

    private void ProtocolBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProtocolBtnMouseClicked
        launcherGame(4);
    }//GEN-LAST:event_ProtocolBtnMouseClicked

    private void ManiobrasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManiobrasBtnMouseClicked
        launcherGame(5);
    }//GEN-LAST:event_ManiobrasBtnMouseClicked

    private void SeñalizaciónBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeñalizaciónBtnMouseClicked
        launcherGame(6);
    }//GEN-LAST:event_SeñalizaciónBtnMouseClicked

    public void launcherGame(int game) {
        VistaGame vistaGame = new VistaGame();
        vistaGame.selectorGame(game);
        vistaHome.setVisible(false);
        Utility.showPanel(transaparente, vistaGame);

    }

    public void mostrarHome() {
        vistaHome.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManiobrasBtn;
    private javax.swing.JButton ProtocolBtn;
    private javax.swing.JButton RescateBtn;
    private javax.swing.JButton RescateBtn1;
    private javax.swing.JButton SeñalizaciónBtn;
    private javax.swing.JButton TipologíaBtn;
    private javax.swing.JPanel transaparente;
    private javax.swing.JPanel vistaHome;
    // End of variables declaration//GEN-END:variables
}
