
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author king6
 */
public class CategoriaRegistrar extends javax.swing.JFrame {

    String Username;
    Conexion conect;
    CategoriaCRUD ca= new CategoriaCRUD();
    Categoria ca1= new Categoria();
    /**
     * Creates new form RegistrarCategoria
     */
    public CategoriaRegistrar() {
        initComponents();
        
          try{
              conect.abreConexion();
          } catch (ClassNotFoundException ex) {
        Logger.getLogger(EmpaqueOrigin.class.getName()).log(Level.SEVERE, null, ex);
    }  
          setIconImage(new ImageIcon(getClass().getResource("/iconoSW/agro.jpg")).getImage());
          this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfirmarGuardado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfCategoria = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Categoria");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConfirmarGuardado.setText("Guardar");
        btnConfirmarGuardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarGuardadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmarGuardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 143, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IDCategoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txfCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCategoriaKeyTyped(evt);
            }
        });
        getContentPane().add(txfCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 179, -1));

        txfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 179, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registrar Categoria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btnRegresar.setText("<");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        btnMinimizar.setText("-");
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 380, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarGuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarGuardadoActionPerformed
        if(!txfCategoria.getText().isEmpty() && !txfNombre.getText().isEmpty()){            
            Object dat[]= new Object[10];
            dat[0]= Integer.parseInt(String.valueOf(txfCategoria.getText()));
            dat[1]= String.valueOf(txfNombre.getText());
            dat[2]= "'A'";
            try{
                 ca.inserta(dat,conect.abreConexion());
            }catch(Exception ex){
                    Logger.getLogger(CategoriaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Debe Ingresar ID y Nombre");
        } 
    }//GEN-LAST:event_btnConfirmarGuardadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        conect.cerrarConexion();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
         Menu m=new Menu();
           m.setVisible(true);
            m.usuario=String.valueOf(Username);
           dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
           this.setExtendedState(ICONIFIED); 
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void txfCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCategoriaKeyTyped
      char Validar=evt.getKeyChar();
      if(Character.isLetter(Validar)){
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
      }
    }//GEN-LAST:event_txfCategoriaKeyTyped

    private void txfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyTyped
      char Validar=evt.getKeyChar();
      if(Character.isDigit(Validar)){
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");
      } 
    }//GEN-LAST:event_txfNombreKeyTyped

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
            java.util.logging.Logger.getLogger(CategoriaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriaRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarGuardado;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txfCategoria;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables
}
