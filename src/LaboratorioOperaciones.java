

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
 * @author gavil
 */
public class LaboratorioOperaciones {
    
    
     Statement stn;
      static ResultSet rs = null;
     static JTable tableTem;
     static String cadenaSQL;

     
    public void consultaTodosLaboratorios(JTable tabla, Connection con){
       
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL="select * from laboratorios";
           
        try {
            stn=(java.sql.Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
        
            while(rs.next()){
                
                 String X=rs.getString("IDLABORATORIO");
                   String Y=rs.getString("NOMBRE");
                     String A=rs.getString("ORIGEN");
                      String J=rs.getString("ESTATUS");
                       
                Object datosRenglon[]={X,Y,A,J};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
    
    public void consultaEspecifica(JTable tabla, Connection con,Object dato[]){
       
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL="select * from laboratorios where nombre='"+dato[0]+"'";
           
        try {
            stn=(java.sql.Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
        
            while(rs.next()){
                
                 String X=rs.getString("IDLABORATORIO");
                   String Y=rs.getString("NOMBRE");
                     String A=rs.getString("ORIGEN");
                      String J=rs.getString("ESTATUS");
                      
                Object datosRenglon[]={X,Y,A,J};
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
      public void insertalAB(Object datos[],Connection con){
       
     cadenaSQL="insert into laboratorios values(" +  datos[0]+",'" + datos[1]+"',"
             +datos[2]+",'"  +datos[3]+"'" + ")";
        try {
            stn=(java.sql.Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
        
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Laboratorio  existente");
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
      
         public void elimina (Object datos[], Connection conect){
                cadenaSQL= "update LABORATORIOS set estatus='B'"+"where nombre='"+datos[0]+"'";
        
        try{
            stn= (java.sql.Statement) conect.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null,"Categoria dada de baja");
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       public void actualiza(Object datos[], Connection conect){
        
        cadenaSQL= "update LABORATORIOS set nombre='"+datos[0]+"',ORIGEN='"+datos[1]+"'where IDLABORATORIO="+datos[2];
        
        try{
            stn= (java.sql.Statement) conect.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null,"Datos Actualizados");
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           
      public void Activar(Object dato[]){
       
 
        cadenaSQL="update laboratorios set estatus = "+dato[0]+" where idempaque="+dato[1];
           
        try {
            stn.executeUpdate(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Empaque dado de Alta");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
 
    
}
