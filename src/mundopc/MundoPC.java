package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado TecladoHP = new Teclado("bluetooh", "HP");
        Raton ratonHP = new Raton("bluetooh", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, TecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Alienware", 34);
        Teclado TecladoGamer = new Teclado("bluetooh", "Alienware");
        Raton ratonGamer = new Raton("bluetooh", "MSI");
        Computadora computadoraGamer = new Computadora("Computadora Dell ", monitorGamer, TecladoGamer, ratonGamer);

        Orden orden1 = new Orden();
        orden1.agregarCompuadora(computadoraHP);

        orden1.agregarCompuadora(computadoraGamer);
        
        orden1.mostrarOrden();

    }
}
