package launcher;

import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.sound.sampled.Clip;
import model.RutaHome;
import org.json.JSONException;
import utilidades.LectorRutaHome;
import utilidades.Utility;

public final class VistaHome extends javax.swing.JPanel {

    private ArrayList<String> imagenesHome;
    private ArrayList<String> imagenesHome2;
    private LectorRutaHome rutasHome;
    private VistaGame vistaGame;
    private int botonSeleccionado;
    private Utility utilidades;

    /**
     * Creates new form VistaHomeJP
     */
    public VistaHome() throws JSONException, URISyntaxException {
        Utility utilidades = new Utility();
        this.utilidades = utilidades;
        LectorRutaHome rutasHome = new LectorRutaHome();
        VistaGame vistaGame = new VistaGame();
        this.rutasHome = rutasHome;
        this.vistaGame = vistaGame;

        // Inicia los iconos Home
        iconosHome();

        // Inicia componentes
        initComponents();

        colocarTitulo();

        // Inicia botones
        botones();

    }

    public void colocarTitulo() throws JSONException {
        ArrayList<RutaHome> rutas = rutasHome.jsonArray();

        String titulo = rutas.get(botonSeleccionado).getNombre();
        jTextTitulo.setText(titulo);
    }

    public void iconosHome() throws JSONException {
        // Recuperamos datos del Json
        ArrayList<RutaHome> rutas = rutasHome.jsonArray();

        // Creamos Listas para guardar las rutas de las imágenes
        ArrayList<String> rutasImagenesHome = new ArrayList();
        ArrayList<String> rutasImagenesHome2 = new ArrayList();
        String rutaImagenHome = "";
        String rutaImagenHome2 = "";

        // Iteramos el Json y añadimos las rutas de las imagenes a una lista
        for (int x = 0; x <= 0; x++) {

            //JSONArray rutasArray = imagen.getRutaImagenesHome();
            String gradoNumero = rutas.get(x).getNombre();
            for (int i = 0; i <= 5; i++) {

                rutaImagenHome = rutas.get(x).getRutaImagenesHome().getString(i);
                rutaImagenHome2 = rutas.get(x).getRutaImagenesHomeGrandes().getString(i);
                rutasImagenesHome.add(rutaImagenHome);
                rutasImagenesHome2.add(rutaImagenHome2);
            }
        }
        imagenesHome = rutasImagenesHome;
        imagenesHome2 = rutasImagenesHome2;

    }

    public void botones() {

        RescateBtn1.setBackground(new java.awt.Color(0, 0, 0));
        RescateBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(0)))
        );
        RescateBtn1.setContentAreaFilled(false);
        RescateBtn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(0))));
        RescateBtn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome2.get(0))));
        RescateBtn1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //Método poner sonidos a los botones
                Clip sound = utilidades.getSound("seleccionar.wav");
                RescateBtn1MouseClicked(evt);
            }

        });
        vistaHome.add(RescateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 400, 310));

        RescateBtn.setBackground(new java.awt.Color(0, 0, 0));
        RescateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(1)))
        );
        RescateBtn.setContentAreaFilled(false);
        RescateBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(1))));
        RescateBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome2.get(1))));
        RescateBtn.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clip sound = utilidades.getSound("seleccionar.wav");
                RescateBtnMouseClicked(evt);
            }

        });
        vistaHome.add(RescateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 400, 310));

        TipologiaBtn.setBackground(new java.awt.Color(182, 225, 255));
        TipologiaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(2))));
        TipologiaBtn.setContentAreaFilled(false);
        TipologiaBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(2))));
        TipologiaBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome2.get(2))));
        TipologiaBtn.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clip sound = utilidades.getSound("seleccionar.wav");
                TipologiaBtnMouseClicked(evt);
            }

        });
        vistaHome.add(TipologiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, 400, 310));

        ProtocolBtn.setBackground(new java.awt.Color(182, 225, 255));
        ProtocolBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(3))));
        ProtocolBtn.setContentAreaFilled(false);
        ProtocolBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(3))));
        ProtocolBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome2.get(3))));
        ProtocolBtn.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clip sound = utilidades.getSound("seleccionar.wav");
                ProtocolBtnMouseClicked(evt);
            }

        });
        vistaHome.add(ProtocolBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 400, 310));

        ManiobrasBtn.setBackground(new java.awt.Color(182, 225, 255));
        ManiobrasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(4))));
        ManiobrasBtn.setContentAreaFilled(false);
        ManiobrasBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(4))));
        ManiobrasBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome2.get(4))));
        ManiobrasBtn.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clip sound = utilidades.getSound("seleccionar.wav");
                ManiobrasBtnMouseClicked(evt);
            }

        });
        vistaHome.add(ManiobrasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 400, 310));

        SeñalizaciónBtn.setBackground(new java.awt.Color(182, 225, 255));
        SeñalizaciónBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(5))));
        SeñalizaciónBtn.setContentAreaFilled(false);
        SeñalizaciónBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome.get(5))));
        SeñalizaciónBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource(imagenesHome2.get(5))));
        SeñalizaciónBtn.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clip sound = utilidades.getSound("seleccionar.wav");
                SeñalizaciónBtnMouseClicked(evt);
            }

        });
        vistaHome.add(SeñalizaciónBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 400, 310));

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
        TipologiaBtn = new javax.swing.JButton();
        ProtocolBtn = new javax.swing.JButton();
        ManiobrasBtn = new javax.swing.JButton();
        SeñalizaciónBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextTitulo = new javax.swing.JTextArea();
        BarraJL = new javax.swing.JLabel();
        transaparente = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(1540, 850));
        setMinimumSize(new java.awt.Dimension(1540, 850));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1540, 850));
        setVerifyInputWhenFocusTarget(false);

        vistaHome.setBackground(new java.awt.Color(10, 38, 72));
        vistaHome.setForeground(new java.awt.Color(255, 255, 255));
        vistaHome.setFont(new java.awt.Font("Raleway Black", 0, 14)); // NOI18N
        vistaHome.setMaximumSize(new java.awt.Dimension(1540, 850));
        vistaHome.setMinimumSize(new java.awt.Dimension(1540, 850));
        vistaHome.setPreferredSize(new java.awt.Dimension(1540, 850));
        vistaHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RescateBtn1.setBackground(new java.awt.Color(0, 0, 0));
        RescateBtn1.setBorder(new javax.swing.border.MatteBorder(null));
        RescateBtn1.setContentAreaFilled(false);
        RescateBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RescateBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RescateBtn1MouseEntered(evt);
            }
        });
        vistaHome.add(RescateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 400, 310));

        RescateBtn.setBackground(new java.awt.Color(0, 0, 0));
        RescateBtn.setBorder(new javax.swing.border.MatteBorder(null));
        RescateBtn.setContentAreaFilled(false);
        RescateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RescateBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RescateBtnMouseEntered(evt);
            }
        });
        vistaHome.add(RescateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 400, 310));

        TipologiaBtn.setBackground(new java.awt.Color(182, 225, 255));
        TipologiaBtn.setBorder(new javax.swing.border.MatteBorder(null));
        TipologiaBtn.setContentAreaFilled(false);
        TipologiaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TipologiaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TipologiaBtnMouseEntered(evt);
            }
        });
        TipologiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipologiaBtnActionPerformed(evt);
            }
        });
        vistaHome.add(TipologiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, 400, 310));

        ProtocolBtn.setBackground(new java.awt.Color(182, 225, 255));
        ProtocolBtn.setBorder(new javax.swing.border.MatteBorder(null));
        ProtocolBtn.setContentAreaFilled(false);
        ProtocolBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProtocolBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProtocolBtnMouseEntered(evt);
            }
        });
        vistaHome.add(ProtocolBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 400, 320));

        ManiobrasBtn.setBackground(new java.awt.Color(182, 225, 255));
        ManiobrasBtn.setBorder(new javax.swing.border.MatteBorder(null));
        ManiobrasBtn.setContentAreaFilled(false);
        ManiobrasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManiobrasBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManiobrasBtnMouseEntered(evt);
            }
        });
        vistaHome.add(ManiobrasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 400, 320));

        SeñalizaciónBtn.setBackground(new java.awt.Color(182, 225, 255));
        SeñalizaciónBtn.setBorder(new javax.swing.border.MatteBorder(null));
        SeñalizaciónBtn.setContentAreaFilled(false);
        SeñalizaciónBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeñalizaciónBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeñalizaciónBtnMouseEntered(evt);
            }
        });
        vistaHome.add(SeñalizaciónBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 400, 320));

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setOpaque(false);

        jTextTitulo.setEditable(false);
        jTextTitulo.setBackground(new java.awt.Color(10, 38, 72));
        jTextTitulo.setColumns(20);
        jTextTitulo.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jTextTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jTextTitulo.setRows(5);
        jTextTitulo.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextTitulo);

        vistaHome.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 1170, 40));

        BarraJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/interfazGame/Barrita aislada descripción.png"))); // NOI18N
        BarraJL.setText("jLabel1");
        vistaHome.add(BarraJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 10, 40));

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

    private void RescateBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RescateBtn1MouseClicked

        try {
            launcherGame(2);
        } catch (JSONException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_RescateBtn1MouseClicked

    private void ProtocolBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProtocolBtnMouseClicked

        try {
            launcherGame(4);
        } catch (JSONException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ProtocolBtnMouseClicked

    private void ManiobrasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManiobrasBtnMouseClicked

        try {
            launcherGame(5);
        } catch (JSONException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ManiobrasBtnMouseClicked

    private void SeñalizaciónBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeñalizaciónBtnMouseClicked
        try {
            launcherGame(6);
        } catch (JSONException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SeñalizaciónBtnMouseClicked

    private void RescateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RescateBtnMouseClicked
        try {
            launcherGame(1);
        } catch (JSONException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RescateBtnMouseClicked

    private void TipologiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipologiaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipologiaBtnActionPerformed

    private void TipologiaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipologiaBtnMouseClicked
        try {
            launcherGame(3);
        } catch (JSONException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TipologiaBtnMouseClicked

    private void RescateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RescateBtnMouseEntered
        //Sonido al pasar el ratón
        Clip sound = utilidades.getSound("pasar.wav");
    }//GEN-LAST:event_RescateBtnMouseEntered

    private void RescateBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RescateBtn1MouseEntered
        //Sonido al pasar el ratón
        Clip sound = utilidades.getSound("pasar.wav");
    }//GEN-LAST:event_RescateBtn1MouseEntered

    private void TipologiaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipologiaBtnMouseEntered
        //Sonido al pasar el ratón
        Clip sound = utilidades.getSound("pasar.wav");
    }//GEN-LAST:event_TipologiaBtnMouseEntered

    private void ProtocolBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProtocolBtnMouseEntered
        //Sonido al pasar el ratón
        Clip sound = utilidades.getSound("pasar.wav");
    }//GEN-LAST:event_ProtocolBtnMouseEntered

    private void ManiobrasBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManiobrasBtnMouseEntered
        //Sonido al pasar el ratón
        Clip sound = utilidades.getSound("pasar.wav");
    }//GEN-LAST:event_ManiobrasBtnMouseEntered

    private void SeñalizaciónBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeñalizaciónBtnMouseEntered
        //Sonido al pasar el ratón
        Clip sound = utilidades.getSound("pasar.wav");
    }//GEN-LAST:event_SeñalizaciónBtnMouseEntered

    public void launcherGame(int game) throws JSONException, URISyntaxException {

        vistaGame.selectorGame(game);
        vistaHome.setVisible(false);
        transaparente.setVisible(true);
        Utility.showPanel(transaparente, vistaGame);

    }

    public void mostrarHome(int botonEscudo) throws JSONException, URISyntaxException {
        botonSeleccionado = botonEscudo;
        vistaHome.setVisible(true);

    }

    public void borrarTransparente() {
        transaparente.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraJL;
    private javax.swing.JButton ManiobrasBtn;
    private javax.swing.JButton ProtocolBtn;
    private javax.swing.JButton RescateBtn;
    private javax.swing.JButton RescateBtn1;
    private javax.swing.JButton SeñalizaciónBtn;
    private javax.swing.JButton TipologiaBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextTitulo;
    private javax.swing.JPanel transaparente;
    private javax.swing.JPanel vistaHome;
    // End of variables declaration//GEN-END:variables
}
