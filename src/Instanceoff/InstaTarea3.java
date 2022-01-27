package Instanceoff;

public class InstaTarea3 {

        public static void main (String[] args) {
            Robot robot = new Robot();
            System.out.println(robot instanceof Blindaje); // false
            robot = new Soldado();
            System.out.println(robot instanceof Blindaje); // true
        }
    }

    class Robot {}
    interface Blindaje {}
    class Soldado extends Robot implements Blindaje {}
    class Microondas extends Robot {}
/*
su función es la de determinar si el objeto al que apunta una referencia dada
es una instancia de una clase o interfaz concretas.
Así, instanceof devuelve un valor booleano (true/false, verdadero o falso).
su función es la de determinar si el objeto al que apunta una referencia dada es una instancia
 de una clase o interfaz concretas.
 Así, instanceof devuelve un valor booleano (true/false, verdadero o falso).
 */
