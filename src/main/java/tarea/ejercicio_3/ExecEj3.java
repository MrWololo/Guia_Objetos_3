package tarea.ejercicio_3;

import java.util.ArrayList;
import java.util.Collections;

public class ExecEj3 {

    public static ArrayList<Figura> a() {
        ArrayList<Figura> lista = new ArrayList<Figura>();

        Rectangulo rect1 = new Rectangulo();
        Rectangulo rect2 = new Rectangulo("rojo", 10, 10);
        Rectangulo rect3 = new Rectangulo(20, 20);

        Circulo circ1 = new Circulo();
        Circulo circ2 = new Circulo("verde", 10);
        Circulo circ3 = new Circulo(20);

        System.out.println("Inicializados rectangulos y circulos");
        Collections.addAll(lista, rect1, rect2, rect3, circ1, circ2, circ3);
        return lista;

    }

    public static ArrayList<Figura> b(ArrayList<Figura> lista) {

        Cuadrado cuad1 = new Cuadrado();
        Cuadrado cuad2 = new Cuadrado("rojo", 10);
        Cuadrado cuad3 = new Cuadrado(20);

        System.out.println("Inicializados cuadrados");
        Collections.addAll(lista, cuad1, cuad2, cuad3);

        return lista;

    }

    public static void c(ArrayList<Figura> lista) {
        for (Figura figura : lista) {
            System.out.println(figura.toString());
        }
    }

}