
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author je_mg
 */
public class Login extends javax.swing.JFrame {
Conexion con=new Conexion();
    public Login() {
    
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconoSW/agro.jpg")).getImage());
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

        btninicia = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usuariotxf = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btninicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/BOTON_INICIARSESION_1.png"))); // NOI18N
        btninicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciaActionPerformed(evt);
            }
        });
        getContentPane().add(btninicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 100, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/160_F_42459916_Yt7cH133dIcZbaIVMtkEanlXnOG149ZT_1.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/descarga.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 230, 240));
        getContentPane().add(usuariotxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 150, -1));

        pwd.setText("jPasswordField1");
        pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdFocusGained(evt);
            }
        });
        getContentPane().add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/background.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 340, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public Image getImageIcon(){
    Image retV=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("iconoSW/agro.jpg"));
    return retV;
    
    }
    private void btniniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciaActionPerformed

        Object dato[]=new Object[2];
       if(con.logginUser(usuariotxf.getText(), pwd.getText())==true){
       
           Menu m=new Menu();
           m.setVisible(true);
           m.usuario=String.valueOf(con.Name(usuariotxf.getText().toString()));
           dispose();
           System.out.println("felicidades");
                   }
      
               
    }//GEN-LAST:event_btniniciaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    con.cerrarConexion();
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFocusGained
        pwd.setText(null);
    }//GEN-LAST:event_pwdFocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninicia;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pwd;
    public javax.swing.JTextField usuariotxf;
    // End of variables declaration//GEN-END:variables
}
