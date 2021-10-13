
package mx.com.gm.mundopc;


public class Raton extends DispositivoEntrada{


  private final int IdRaton;
  
  private static int contadorRatones;
  
  
    public Raton (String tipoEntrada, String Marca ) {
        
        
        super (tipoEntrada , Marca );
        this.IdRaton = ++Raton.contadorRatones;
        
    }

    @Override
    public String toString() {
        return "Raton{" + "IdRaton=" + IdRaton + " , "+ super.toString()+'}';
    }
    
    
        
    }
    

