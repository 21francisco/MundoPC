package mx.com.gm.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int ContadorMonitores;

    private Monitor() {

        this.idMonitor = ++Monitor.ContadorMonitores;

    }

    public Monitor(String Marca, double Tamano) {

        this();
        this.marca = marca;
        this.tamano = tamano;

    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }

}
