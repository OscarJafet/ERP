
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author king6
 */
public class CategoriaEliminar extends javax.swing.JFrame {

    String Username;
    Conexion conect;
    CategoriaCRUD ca= new CategoriaCRUD();
    /**
     * Creates new form EliminarCategoria
     */
    public CategoriaEliminar() {
        initComponents();
        
         setIconImage(new ImageIcon(getClass().getResource("/iconoSW/agro.jpg")).getImage());
          this.setLocationRelativeTo(null);
          
              try {
        conect.abreConexion();
        ca.ConsultaGeneral(Tabla1, conect.abreConexion());
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(EmpaqueOrigin.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        btnElimina = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnMinimar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eliminar Categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, -1));

        txfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 64, 170, -1));

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDcategoria", "Nombre", "Estatus"
            }
        ));
        jScrollPane1.setViewportView(Tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 375, 275));

        btnElimina.setText("X");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });
        getContentPane().add(btnElimina, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 11, -1, -1));

        btnRegresar.setText("<");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 11, -1, -1));

        btnMinimar.setText("-");
        btnMinimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimar, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 11, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 410, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        conect.cerrarConexion();
        System.exit(0);
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
           Menu m=new Menu();
           m.setVisible(true);
            m.usuario=String.valueOf(Username);
           dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMinimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimarActionPerformed
            this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            Object dat[]= new Object[10];
            int valor= Tabla1.getSelectedRow();
            
            if (valor!=-1){
                txfNombre.setText(String.valueOf(Tabla1.getValueAt(Tabla1.getSelectedRow(), 1).toString()));
                Object status;
                status= String.valueOf(Tabla1.getValueAt(Tabla1.getSelectedRow(), 2).toString());
                
                if( status.equals("A")){
                    dat[0]=String.valueOf(Tabla1.getValueAt(Tabla1.getSelectedRow(), 1).toString());
                  
                    try{
                        
                        ca.elimina(dat,conect.abreConexion());
                        borrarTabla(Tabla1);
                    }catch(Exception ex){
                    Logger.getLogger(EmpaqueOrigin.class.getName()).log(Level.SEVERE, null, ex);
                }
                    try {
                        ca.ConsultaGeneral(Tabla1, conect.abreConexion());
                    }catch (Exception ex) {
                    Logger.getLogger(EmpaqueOrigin.class.getName()).log(Level.SEVERE, null, ex);
                }
                }else{
                    JOptionPane.showMessageDialog(null,"Seleccione un registro con baja");
                }
            
            }else{
                JOptionPane.showMessageDialog(null,"Debe Seleccuonar una fila");
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyTyped
      char Validar=evt.getKeyChar();
      if(Character.isDigit(Validar)){
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");
      }        
    }//GEN-LAST:event_txfNombreKeyTyped

        public void borrarTabla(JTable tabla){
        DefaultTableModel tamblatem=(DefaultTableModel)tabla.getModel();
            for (int i = tamblatem.getRowCount()-1; i >=0; i--) {
                tamblatem.removeRow(i);
                tamblatem.removeTableModelListener(tabla);
            }
    }
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
            java.util.logging.Logger.getLogger(CategoriaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriaEliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMinimar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables
}
