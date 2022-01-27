package Interfacess;

//public class InterfaccTarea3 {

    abstract class Vehiculo { }

    interface GPS {
        boolean gpsActivado();
    }

    public class Coche extends Vehiculo implements GPS {

        public boolean gpsActivado() {
            return true;
        }

        public static void main(String[] args) {
            System.out.println(new Coche().gpsActivado());
        }
    }




/*
a la hora de implementar los métodos en la clase, tu método debe ser explícitamente public
 la clase Coche hereda un método abstracto al que pueden acceder otras clases dentro del paquete.
 La implementación mantiene el mismo acceso
 */