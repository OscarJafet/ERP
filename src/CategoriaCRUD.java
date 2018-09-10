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
 * @author king6
 */
public class CategoriaCRUD {
    
    Statement stn; 
    static ResultSet rs = null;
    static JTable tableTem;
    static String cadenaSQL;
    
    public void ConsultaGeneral(JTable tabla,Connection conect){
        
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL="select idcategoria,nombre,estatus from categoria";
        
        try {
            stn=(java.sql.Statement) conect.createStatement();
            rs=stn.executeQuery(cadenaSQL);
                    while(rs.next()){
                
                 String IDCATEGORIA=rs.getString("IDCATEGORIA");
                   String NOMBRE=rs.getString("NOMBRE");
                     String ESTATUS=rs.getString("ESTATUS");
                       
                Object datosRenglon[]={IDCATEGORIA,NOMBRE,ESTATUS};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ConsultaEspecifica (JTable tabla,Connection conect, Object dato[]){
        
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL="select idcategoria,nombre,estatus from categoria where nombre='"+dato[0]+"'";
        
        try {
            stn=(java.sql.Statement) conect.createStatement();
            rs=stn.executeQuery(cadenaSQL);
                    while(rs.next()){
                
                 String IDCATEGORIA=rs.getString("IDCATEGORIA");
                   String NOMBRE=rs.getString("NOMBRE");
                     String ESTATUS=rs.getString("ESTATUS");
                       
                Object datosRenglon[]={IDCATEGORIA,NOMBRE,ESTATUS};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void inserta (Object datos[],Connection conect){
        
      cadenaSQL= "insert into CATEGORIA values("+datos[0]+",'"+datos[1]+"',"+datos[2]+")";
        try {
            stn=(java.sql.Statement) conect.createStatement();
            rs= stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Categoria existente");
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void actualiza(Object datos[], Connection conect){
        
        cadenaSQL= "update CATEGORIA set nombre='"+datos[0]+"' where IDCATEGORIA="+datos[1];
        
        try{
            stn= (java.sql.Statement) conect.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null,"Datos Actualizados");
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void elimina (Object datos[], Connection conect){
                cadenaSQL= "update CATEGORIA set estatus='B'"+"where nombre='"+datos[0]+"'";
        
        try{
            stn= (java.sql.Statement) conect.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null,"Categoria dada de baja");
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void alta (Object datos[],Connection conect){
                cadenaSQL= "update CATEGORIA set estatus='A'"+"where nombre='"+datos[0]+"'";
        
        try{
            stn= (java.sql.Statement) conect.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null,"Categoria dada de alta");
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
