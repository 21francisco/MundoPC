
package mx.com.gm.mundopc;


public class Teclado extends DispositivoEntrada {
    
    
  private final int IdTeclado;
  
  private static int contadorTeclado;
  
  
    public Teclado (String tipoEntrada, String Marca ) {
        
        
        super (tipoEntrada , Marca );
        this.IdTeclado = ++Teclado.contadorTeclado;
        
    }

    @Override
    public String toString() {
        return "Teclado{" + "IdTeclado=" + IdTeclado + " , "+ super.toString()+'}';
    }
    
    
    
}
