
import java.util.Calendar;
import java.util.Date ;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
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
         this.setLocationRelativeTo(null);
         //this.setExtendedState(MAXIMIZED_BOTH);
      jPanel1.setLocation(0,0);
         
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
        empaque = new javax.swing.JMenu();
        MCategoria = new javax.swing.JMenu();

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
        labo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laboMouseClicked(evt);
            }
        });
        labo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laboActionPerformed(evt);
            }
        });
        mbMenuprincipal.add(labo);

        empaque.setText("Empaque");
        empaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empaqueMouseClicked(evt);
            }
        });
        mbMenuprincipal.add(empaque);

        MCategoria.setText("Categoria");
        MCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MCategoriaMouseClicked(evt);
            }
        });
        mbMenuprincipal.add(MCategoria);

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
    Reloj r=new Reloj(lblhora);
       r.iniciar();
       r.start();
        Calendar fecha = new GregorianCalendar();
       
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        lblfecha.setText(""+dia+"/"+ (mes+1) +"/"+ano);
       
      
    }//GEN-LAST:event_formWindowGainedFocus

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       con.cerrarConexion();
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void MinimizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizaActionPerformed
       this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizaActionPerformed

    private void laboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laboActionPerformed

    }//GEN-LAST:event_laboActionPerformed

    private void laboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_laboFocusGained
       
    }//GEN-LAST:event_laboFocusGained

    private void laboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laboMouseClicked
     System.out.println("hola"
               );
    }//GEN-LAST:event_laboMouseClicked

    private void empaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empaqueMouseClicked
       Empaque e=new Empaque();
        e.setVisible(true);
        e.Username=usuario;
        dispose();
       
    }//GEN-LAST:event_empaqueMouseClicked

    private void regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresaActionPerformed
        Login m=new Login();
        m.setVisible(true);
    

        dispose();
    }//GEN-LAST:event_regresaActionPerformed

    private void MCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MCategoriaMouseClicked
        Categoria c= new Categoria();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MCategoriaMouseClicked

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
    private javax.swing.JMenu MCategoria;
    private javax.swing.JButton Minimiza;
    private javax.swing.JMenu empaque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu labo;
    private javax.swing.JLabel lblLoginUser;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JMenuBar mbMenuprincipal;
    private javax.swing.JButton regresa;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
