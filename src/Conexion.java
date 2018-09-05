
import java.sql.Statement;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.Connection;
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
public class Conexion {
  static String conexionURL = "jdbc:oracle:thin:@localhost:1521:XE"; 
   static Connection con=null;
     static String user= "ERP";
       static String pwd = "1234"; 
     Statement stn;
      static ResultSet rs = null;
     static JTable tableTem;
     static String cadenaSQL;
    private String usuarioname;
   
    
   public static Connection abreConexion() throws ClassNotFoundException{
       if(con==null){
        try {
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con=DriverManager.getConnection(conexionURL,user,pwd);
            
            return con;
               
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "no se pudo");
             return null;
      
        }
       }
       return con;
   }
   
   
   public static Connection cerrarConexion(){
   
       if(con!=null){
        try {
            con.close();
            return null;
        } catch (SQLException ex) {
              JOptionPane.showConfirmDialog(null, "no se pudo");
      
        }
       }
       
       return con;
   }

        public boolean logginUser(Object username, Object pwd){
       
       
        cadenaSQL="select estatus from usuarios where nombre = '" + username +"' and contrasenia = '"+pwd+"'" ;
           
        try {
          
          String status = null;
       stn =  abreConexion().createStatement();
       rs = stn.executeQuery(cadenaSQL);
      
       
            while(rs.next()){
                     status=rs.getString("ESTATUS");   
            }
            if(status!=null){
                if(status.toString().equals("A")){
                    setUsuario(String.valueOf(username));
                    return true;  
                }else 
                        JOptionPane.showConfirmDialog(null, "Usuario dado de baja");
                     return false;
            }         
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
            JOptionPane.showConfirmDialog(null, "Usuario incorrecto o contraseña incorrecta");
            return false;
     
     }
        
        
        
        public String Name(Object username){
       
       
        cadenaSQL="select distinct em.nombre, em.apaterno from usuarios us "
                + "inner join empleados em on em.idempleado=us.idempleado "
                + "where us.nombre='"+username+"' " ;
           
        try {
          
          String status = null;
              String apellido= null;
       stn =  abreConexion().createStatement();
       rs = stn.executeQuery(cadenaSQL);
      
       
            while(rs.next()){
                     status=rs.getString("NOMBRE");  
                      apellido=rs.getString("APATERNO");  
            }
            
                    return status +" " +apellido;  
                      
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
            JOptionPane.showConfirmDialog(null, "User incorrecto");
            return "";
     
     }
        
        
        
        public void setUsuario(String Usuario){
            usuarioname=Usuario;
        }
        
        public String getUsuario(){
            return usuarioname;
        }
    
}
