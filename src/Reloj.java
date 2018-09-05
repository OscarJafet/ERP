import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author jes
 */
public class Reloj extends Thread{
        
    boolean estado;
    Calendar relo;
    String H,M,S;
    public JLabel hora;
    
    public Reloj(JLabel hora) {
        this.hora=hora;
            
    }
    
    @Override
    public void run() {
      while(estado){
          relo=new GregorianCalendar();
        
          
            int h = relo.get(Calendar.HOUR_OF_DAY), m= relo.get(Calendar.MINUTE), s= relo.get(Calendar.SECOND);
            hora.setText(String.valueOf (h) + ":" + String.valueOf(m) + ":" + String.valueOf(s));
            
                try {
                    this.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        }  
    }
    public void iniciar(){
    estado=true;
    }
   public void   terminar(){
       estado=false;
    } 
  
}

