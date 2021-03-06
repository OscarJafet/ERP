

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
 * @author je_mg
 */
public class EmpaqueOperaciones {
   
     Statement stn;
      static ResultSet rs = null;
     static JTable tableTem;
     static String cadenaSQL;

     
    public void consultaTodosEmpaque(JTable tabla, Connection con){
       
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL="select em.IDEMPAQUE,em.NOMBRE,em.CAPACIDAD,em.ESTATUS,uni.NOMBRE as nomm from empaques em, unidadmedida uni"
                + " where em.idunidad= uni.idunidad";
           
        try {
            stn=(java.sql.Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
        
            while(rs.next()){
                
                 String X=rs.getString("IDEMPAQUE");
                   String Y=rs.getString("NOMBRE");
                     String A=rs.getString("CAPACIDAD");
                      String J=rs.getString("ESTATUS");
                       String  K=rs.getString("nomm");
                       
                Object datosRenglon[]={X,Y,A,J,K};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
    
    public void consultaEspecifica(JTable tabla, Connection con,Object dato[]){
       
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL="select em.IDEMPAQUE,em.NOMBRE,em.CAPACIDAD,em.ESTATUS,uni.NOMBRE as nomm from empaques em, unidadmedida uni where em.nombre='"+dato[0]+"' and "
                + " em.idunidad= uni.idunidad";
           
        try {
            stn=(java.sql.Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
        
            while(rs.next()){
                
                 String X=rs.getString("IDEMPAQUE");
                   String Y=rs.getString("NOMBRE");
                     String A=rs.getString("CAPACIDAD");
                      String J=rs.getString("ESTATUS");
                           String  K=rs.getString("nomm");
                       
                Object datosRenglon[]={X,Y,A,J,K};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
      
      
 public void consultaregistroE(JTable tabla, Connection con){
       
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL="select IDUNIDAD,NOMBRE from unidadmedida";
           
        try {
            stn=(java.sql.Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
        
            while(rs.next()){
                
                 String X=rs.getString("IDUNIDAD");
                   String Y=rs.getString("NOMBRE");
                    
                       
                Object datosRenglon[]={X,Y};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
      public void insertaEmpaque(Object datos[]){
       
     cadenaSQL="insert into Empaques values(" +  datos[0]+",'" + datos[1]+"',"
             +  datos[2]+"," + datos[3]+"," + datos[4]+")";
        try {
            stn.executeUpdate(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Emplaque existente");
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
      
         public void BajaEmpaque(Object dato[]){
       
 
        cadenaSQL="update empaques set estatus = "+dato[0]+" where idempaque="+dato[1];
           
        try {
            stn.executeUpdate(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Empaque dado de baja");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
       
           public void actualizarCantidad(Object dato[]){
       
 
        cadenaSQL="update empaques set  Capacidad="+dato[0]+" where idempaque="+dato[1];
           
        try {
            stn.executeUpdate(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Actualizacion Correcta");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
           
      public void Activar(Object dato[]){
       
 
        cadenaSQL="update empaques set estatus = "+dato[0]+" where idempaque="+dato[1];
           
        try {
            stn.executeUpdate(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Empaque dado de Alta");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
 
 
}

