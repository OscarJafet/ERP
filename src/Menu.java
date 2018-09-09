
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author je_mg
 */
public class Menu extends javax.swing.JFrame {

    Conexion con;
    String usuario;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconoSW/agro.jpg")).getImage());
        this.setLocationRelativeTo(null);
        //this.setExtendedState(MAXIMIZED_BOTH);
        jPanel1.setLocation(0, 0);

        try {
            this.setLocationRelativeTo(null);
            con.abreConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblfecha = new javax.swing.JLabel();
        lblLoginUser = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        regresa = new javax.swing.JButton();
        Minimiza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mbMenuprincipal = new javax.swing.JMenuBar();
        labo = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        empaqueActualiza_activa = new javax.swing.JMenu();
        registrar_Empaque = new javax.swing.JMenuItem();
        consulta_baja_Empaque = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        listageneralEmpaque = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Actuva_actualiza_Empaque = new javax.swing.JMenuItem();
        MCategoria = new javax.swing.JMenu();
        miRegistraCategoria = new javax.swing.JMenuItem();
        miConsulta = new javax.swing.JMenuItem();
        miActualiza = new javax.swing.JMenuItem();
        miEliminar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfecha.setBackground(new java.awt.Color(255, 255, 255));
        lblfecha.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(255, 255, 255));
        lblfecha.setToolTipText("");
        lblfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 100, 29));

        lblLoginUser.setBackground(new java.awt.Color(255, 255, 255));
        lblLoginUser.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        lblLoginUser.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginUser.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(lblLoginUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 118, 39));

        lblhora.setBackground(new java.awt.Color(255, 255, 255));
        lblhora.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        lblhora.setForeground(new java.awt.Color(255, 255, 255));
        lblhora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 75, 29));

        salir.setText("X");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 40, 20));

        regresa.setText("<");
        regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresaActionPerformed(evt);
            }
        });
        jPanel1.add(regresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 40, 20));

        Minimiza.setText("-");
        Minimiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizaActionPerformed(evt);
            }
        });
        jPanel1.add(Minimiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 40, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/fonodo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labo.setText("Laboratorio");
        labo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                laboFocusGained(evt);
            }
        });

        jMenuItem3.setText("Registrar");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        labo.add(jMenuItem3);

        jMenuItem2.setText("Actualizar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        labo.add(jMenuItem2);

        jMenuItem4.setText("Consultar");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        labo.add(jMenuItem4);

        jMenuItem5.setText("Eliminar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        labo.add(jMenuItem5);

        mbMenuprincipal.add(labo);

        empaqueActualiza_activa.setText("Empaque");
        empaqueActualiza_activa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empaqueActualiza_activaMouseClicked(evt);
            }
        });
        empaqueActualiza_activa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empaqueActualiza_activaActionPerformed(evt);
            }
        });

        registrar_Empaque.setText("Registrar");
        registrar_Empaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_EmpaqueActionPerformed(evt);
            }
        });
        empaqueActualiza_activa.add(registrar_Empaque);

        consulta_baja_Empaque.setText("Consulta y Baja");
        consulta_baja_Empaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_baja_EmpaqueActionPerformed(evt);
            }
        });
        empaqueActualiza_activa.add(consulta_baja_Empaque);
        empaqueActualiza_activa.add(jSeparator1);

        listageneralEmpaque.setText("ListaGeneral");
        listageneralEmpaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listageneralEmpaqueActionPerformed(evt);
            }
        });
        empaqueActualiza_activa.add(listageneralEmpaque);
        empaqueActualiza_activa.add(jSeparator2);

        Actuva_actualiza_Empaque.setText("Actualizar cantidad y Activar Empaque");
        Actuva_actualiza_Empaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actuva_actualiza_EmpaqueActionPerformed(evt);
            }
        });
        empaqueActualiza_activa.add(Actuva_actualiza_Empaque);

        mbMenuprincipal.add(empaqueActualiza_activa);

        MCategoria.setText("Categoria");

        miRegistraCategoria.setText("Registrar");
        miRegistraCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistraCategoriaActionPerformed(evt);
            }
        });
        MCategoria.add(miRegistraCategoria);

        miConsulta.setText("Consultar");
        miConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaActionPerformed(evt);
            }
        });
        MCategoria.add(miConsulta);

        miActualiza.setText("Actualizar");
        miActualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActualizaActionPerformed(evt);
            }
        });
        MCategoria.add(miActualiza);

        miEliminar.setText("Eliminar");
        miEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarActionPerformed(evt);
            }
        });
        MCategoria.add(miEliminar);

        mbMenuprincipal.add(MCategoria);

        jMenu1.setText("Unidad De Medida");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        mbMenuprincipal.add(jMenu1);

        setJMenuBar(mbMenuprincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        lblLoginUser.setText(usuario);
        Reloj r = new Reloj(lblhora);
        r.iniciar();
        r.start();
        Calendar fecha = new GregorianCalendar();

        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        lblfecha.setText("" + dia + "/" + (mes + 1) + "/" + ano);


    }//GEN-LAST:event_formWindowGainedFocus

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        con.cerrarConexion();
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void MinimizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizaActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizaActionPerformed

    private void laboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_laboFocusGained

    }//GEN-LAST:event_laboFocusGained

    private void empaqueActualiza_activaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empaqueActualiza_activaMouseClicked
//       Empaque e=new Empaque();
//        e.setVisible(true);
//        e.Username=usuario;
//        dispose();
//       
    }//GEN-LAST:event_empaqueActualiza_activaMouseClicked

    private void regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresaActionPerformed
        Login m = new Login();
        m.setVisible(true);


        dispose();
    }//GEN-LAST:event_regresaActionPerformed

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        Laboratorio m = new Laboratorio();
        m.setVisible(true);
        m.Username = usuario;
        dispose();


    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
        LabConsulta l = new LabConsulta();
        l.setVisible(true);
        l.Username = usuario;
        dispose();

    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        LabConsulta l = new LabConsulta();
        l.setVisible(true);
        l.Username = usuario;
        dispose();


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Laboratorio m = new Laboratorio();
        m.setVisible(true);
        m.Username = usuario;
        dispose();

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        LabActualizar m = new LabActualizar();
        m.setVisible(true);
        m.Username = usuario;
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        LabEliminar m = new LabEliminar();
        m.setVisible(true);
        m.Username = usuario;
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Unidad_Medida m = new Unidad_Medida();
        m.setVisible(true);
        m.Username = usuario;
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void registrar_EmpaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_EmpaqueActionPerformed
        EmpaqueRegistra m = new EmpaqueRegistra();
        m.setVisible(true);
        m.Username = usuario;
        dispose();
    }//GEN-LAST:event_registrar_EmpaqueActionPerformed

    private void consulta_baja_EmpaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_baja_EmpaqueActionPerformed
        EmpaqueConsultaBaja m = new EmpaqueConsultaBaja();
        m.setVisible(true);
        m.Username = usuario;
        dispose();
    }//GEN-LAST:event_consulta_baja_EmpaqueActionPerformed

    private void listageneralEmpaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listageneralEmpaqueActionPerformed
        ListaGeneralEmpaque m = new ListaGeneralEmpaque();
        m.setVisible(true);
        m.Username = usuario;
        dispose();

    }//GEN-LAST:event_listageneralEmpaqueActionPerformed

    private void empaqueActualiza_activaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empaqueActualiza_activaActionPerformed
        EmpaqueActualizayactiva m = new EmpaqueActualizayactiva();
        m.setVisible(true);
        m.Username = usuario;
        dispose();
    }//GEN-LAST:event_empaqueActualiza_activaActionPerformed

    private void Actuva_actualiza_EmpaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actuva_actualiza_EmpaqueActionPerformed
        EmpaqueActualizayactiva m = new EmpaqueActualizayactiva();
        m.setVisible(true);
        m.Username = usuario;
        dispose();
    }//GEN-LAST:event_Actuva_actualiza_EmpaqueActionPerformed

    private void miRegistraCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistraCategoriaActionPerformed
        CategoriaRegistrar reca = new CategoriaRegistrar();
        reca.setVisible(true);
        reca.Username = usuario;
        dispose();
    }//GEN-LAST:event_miRegistraCategoriaActionPerformed

    private void miEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarActionPerformed
        CategoriaEliminar elca = new CategoriaEliminar();
        elca.setVisible(true);
        elca.Username = usuario;
        dispose();
    }//GEN-LAST:event_miEliminarActionPerformed

    private void miConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaActionPerformed
          Categoria ca= new Categoria();
          ca.setVisible(true);
          ca.username= usuario;
          dispose();
    }//GEN-LAST:event_miConsultaActionPerformed

    private void miActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActualizaActionPerformed
          CategoriaActualiza acca= new CategoriaActualiza();
          acca.setVisible(true);
          acca.Username= usuario;
          dispose();
    }//GEN-LAST:event_miActualizaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Actuva_actualiza_Empaque;
    private javax.swing.JMenu MCategoria;
    private javax.swing.JButton Minimiza;
    private javax.swing.JMenuItem consulta_baja_Empaque;
    private javax.swing.JMenu empaqueActualiza_activa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu labo;
    private javax.swing.JLabel lblLoginUser;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JMenuItem listageneralEmpaque;
    private javax.swing.JMenuBar mbMenuprincipal;
    private javax.swing.JMenuItem miActualiza;
    private javax.swing.JMenuItem miConsulta;
    private javax.swing.JMenuItem miEliminar;
    private javax.swing.JMenuItem miRegistraCategoria;
    private javax.swing.JMenuItem registrar_Empaque;
    private javax.swing.JButton regresa;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
