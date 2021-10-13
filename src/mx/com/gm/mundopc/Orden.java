package mx.com.gm.mundopc;

public class Orden {

    private final int idOrden;

    private Computadora Computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden() {

        this.idOrden = ++Orden.contadorOrdenes;
        Computadoras = new Computadora[Orden.MAX_COMPUTADORAS];

    }

    public void agregarCompuadora(Computadora computadora) {

        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.Computadoras[this.contadorComputadoras++] = computadora;
        } else {

            System.out.println("has superado el limite: " + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {

        System.out.println("Orden #:" + this.idOrden);

        System.out.println("Computadoras de la orden #:" + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.Computadoras[i]);
            
        }

    }

}
