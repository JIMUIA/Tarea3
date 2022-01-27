package varargs;

public class VarargsTarea3 {

    static void display(int num, String... values) {
        System.out.println("Este numero es: " + num);
        for (String s : values) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        display(500,"Hola Tarea 3");
        display(1000,"es","un","ejemplo","con Varargs...");
    }
}