
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
public class Operaciones_UnidadMEdida {
    
     Statement stn;
      static ResultSet rs = null;
     static JTable tableTem;
     static String cadenaSQL;

     
    public void consultaTodosUnidadMedida(JTable tabla, Connection con){
       
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL="select IDUNIDAD,NOMBRE,SIGLAS,ESTATUS from UNIDADMEDIDA";
           
        try {
            stn=(java.sql.Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
        
            while(rs.next()){
                
                 String X=rs.getString("IDUNIDAD");
                   String Y=rs.getString("NOMBRE");
                     String A=rs.getString("SIGLAS");
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
        cadenaSQL="select * from unidadmedida where nombre='"+dato[0]+"'";
           
        try {
            stn=(java.sql.Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
        
            while(rs.next()){
                
                 String X=rs.getString("IDUNIDAD");
                   String Y=rs.getString("NOMBRE");
                     String A=rs.getString("SIGLAS");
                      String J=rs.getString("ESTATUS");
                          
                       
                Object datosRenglon[]={X,Y,A,J};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
      
      
 
      public void insertaUnidad(Object datos[]){
       
     cadenaSQL="insert into unidadmedida values(" +  datos[0]+",'" + datos[1]+"','"
             +  datos[2]+"'," + datos[3]+")";
        try {
            stn.executeUpdate(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unidad existente");
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
      
         public void Baja(Object dato[]){
       
 
        cadenaSQL="update unidadmedida set estatus = "+dato[0]+" where idunidad="+dato[1];
           
        try {
            stn.executeUpdate(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Unidad dada de baja");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
       
         
           
      public void Activar(Object dato[]){
       
 
        cadenaSQL="update unidadmedida set estatus = "+dato[0]+" where idunidad="+dato[1];
           
        try {
            stn.executeUpdate(cadenaSQL);
            JOptionPane.showMessageDialog(null, 
                    "Unidad dada de Alta");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }  
}
