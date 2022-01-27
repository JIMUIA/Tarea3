package Interfacess;


abstract class Vehiculos {
    abstract boolean gpsactivado();
}

interface gps { }

public class Coches extends Vehiculos implements gps {

    boolean gpsactivado() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Coches().gpsactivado());
    }
}