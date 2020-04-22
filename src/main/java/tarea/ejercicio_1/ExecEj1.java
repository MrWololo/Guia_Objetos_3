package tarea.ejercicio_1;

public class ExecEj1 {

    public static void a() {
        Cilindro cilindro = new Cilindro();
        System.out.println(cilindro.toString() + ", Volumen: " + cilindro.df.format(cilindro.getVolumen()));
    }

    public static void b() {
        Cilindro cilindro = new Cilindro(10, 7);
        System.out.println(cilindro.toString() + ", Volumen: " + cilindro.df.format(cilindro.getVolumen()));
    }

    public static void c() {
        Cilindro cilindro = new Cilindro(13, 12);
        System.out.println("Area: " + cilindro.df.format(cilindro.getArea()) + ", Volumen: "
                + cilindro.df.format(cilindro.getVolumen()));
    }

    public static void d() {
        Cilindro cilindro = new Cilindro();
        System.out.println(cilindro.toString());
    }

}