
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavil
 */
public class Laboratorio extends javax.swing.JFrame {
    String Username;
    Conexion cont;
    LaboratorioOperaciones la= new LaboratorioOperaciones();

    /**
     * Creates new form Laboratorio
     */
    public Laboratorio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
     public void Datos(String a, String b,String c,String d){
           txfIDlaboratorio.setText(a);
           txfNombre.setText(b);
           txfOrigen.setText(c);
           
          
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfIDlaboratorio = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        txfOrigen = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Minimiza = new javax.swing.JButton();
        regresa = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Laboratorio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Origen");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 30));

        txfIDlaboratorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfIDlaboratorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIDlaboratorioKeyTyped(evt);
            }
        });
        getContentPane().add(txfIDlaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 170, 30));

        txfNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, 30));

        txfOrigen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfOrigenKeyTyped(evt);
            }
        });
        getContentPane().add(txfOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 90, -1));

        Minimiza.setText("-");
        Minimiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizaActionPerformed(evt);
            }
        });
        getContentPane().add(Minimiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 0, 40, 20));

        regresa.setText("<");
        regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresaActionPerformed(evt);
            }
        });
        getContentPane().add(regresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 0, 40, 20));

        salir.setText("X");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 0, 40, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
             if(!txfIDlaboratorio.getText().isEmpty() && !txfNombre.getText().isEmpty()){
           Object dato[]=new Object[10];
           dato[0]=Integer.parseInt(String.valueOf(txfIDlaboratorio.getText()));
           dato[1]=String.valueOf(txfNombre.getText());
           dato[2]=String.valueOf(txfOrigen.getText());
           dato[3]="'A'";
          
 
          try {
                     la.insertalAB(dato,cont.abreConexion());
              
              } catch (ClassNotFoundException ex) {
        
                  Logger.getLogger(EmpaqueOrigin.class.getName()).log(Level.SEVERE, null, ex);
    
              }
             }
   
       txfIDlaboratorio.setText(null);
       txfNombre.setText(null);
       txfOrigen.setText(null);
       
       




    }//GEN-LAST:event_jButton1ActionPerformed

    private void MinimizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizaActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizaActionPerformed

    private void regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresaActionPerformed
        Menu m=new Menu();
        m.setVisible(true);
        m.usuario=Username;
        dispose();
    }//GEN-LAST:event_regresaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        cont.cerrarConexion();
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void txfIDlaboratorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIDlaboratorioKeyTyped
     char Validar=evt.getKeyChar();
      if(Character.isLetter(Validar)){
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
      }
    }//GEN-LAST:event_txfIDlaboratorioKeyTyped

    private void txfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyTyped
      char Validar=evt.getKeyChar();
      if(Character.isDigit(Validar)){
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");
      } 
    }//GEN-LAST:event_txfNombreKeyTyped

    private void txfOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfOrigenKeyTyped
      char Validar=evt.getKeyChar();
      if(Character.isDigit(Validar)){
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");
      }         // TODO add your handling code here:
    }//GEN-LAST:event_txfOrigenKeyTyped
    
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
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboratorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Minimiza;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton regresa;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txfIDlaboratorio;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfOrigen;
    // End of variables declaration//GEN-END:variables
}
