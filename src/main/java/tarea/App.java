package tarea;

import java.util.ArrayList;
import java.util.Scanner;

import tarea.ejercicio_1.ExecEj1;
import tarea.ejercicio_2.Estudiante;
import tarea.ejercicio_2.ExecEj2;
import tarea.ejercicio_2.Persona;
import tarea.ejercicio_2.Staff;

public final class App {

    public static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        char repeat = 's';

        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        ArrayList<Staff> staff = new ArrayList<Staff>();
        ArrayList<Persona> personas = new ArrayList<Persona>();
        int cantEst = 0;
        double ingresos = 0;

        while (repeat == 's') {
            VisualMenu.principal();
            final int ejercicio = scan.nextInt();
            int punto;
            switch (ejercicio) {
                case 1:
                    VisualMenu.ej1();
                    punto = scan.nextInt();
                    switch (punto) {
                        case 1:
                            ExecEj1.a();
                            break;
                        case 2:
                            ExecEj1.b();
                            break;
                        case 3:
                            ExecEj1.c();
                            break;
                        case 4:
                            ExecEj1.d();
                            break;
                    }
                    break;
                case 2:
                    VisualMenu.ej2();
                    punto = scan.nextInt();
                    switch (punto) {
                        case 1:
                            estudiantes = ExecEj2.a();
                            System.out.println("Inicializado Estudiantes");
                            break;
                        case 2:
                            staff = ExecEj2.b();
                            System.out.println("Inicializado Staff");
                            break;
                        case 3:
                            personas = ExecEj2.c(estudiantes, staff);
                            System.out.println("Inicializado Personas");
                            break;
                        case 4:
                            cantEst = ExecEj2.d(personas);
                            System.out.println("Estudiantes: " + cantEst + ", Staff: " + (personas.size() - cantEst));
                            break;
                        case 5:
                            ingresos = ExecEj2.e(personas);
                            System.out.println("Ingreso de cuotas: " + ingresos);
                            break;
                    }
                    break;
            }
        }
        scan.close();
    }
}
