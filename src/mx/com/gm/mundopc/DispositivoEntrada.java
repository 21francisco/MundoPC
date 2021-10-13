
package mx.com.gm.mundopc;

public class DispositivoEntrada {
    
    private String tipoDeEntrada;
    private String marca;
    
    public DispositivoEntrada (String tipoEntrada, String marca ){
        
        this.tipoDeEntrada = tipoEntrada;
        this.marca = marca;
    
    }

    public String getTipoDeEntrada() {
        return this.tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoDeEntrada=" + tipoDeEntrada + ", marca=" + marca + '}';
    }
    
    
    
}
