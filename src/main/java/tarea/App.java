package tarea;

import java.util.Scanner;

import tarea.ejercicio_1.ExecEj1;

public final class App {

    public static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        char repeat = 's';

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

                /*
                 * case 2: VisualMenu.ej2(); punto = scan.nextInt(); switch (punto) { case 1:
                 * ExecEj2.a(); break; case 2: consumidor = ExecEj2.b(); break; case 3: factura
                 * = ExecEj2.c(consumidor); break; case 4: ExecEj2.d(factura); break; case 5:
                 * ExecEj2.e(); break; } break;
                 * 
                 * case 3: VisualMenu.ej3(); punto = scan.nextInt(); switch (punto) { case 1:
                 * cliente = ExecEj3.a(); break; case 2: cuenta = ExecEj3.b(cliente); break;
                 * case 3: cuenta = ExecEj3.c(cuenta); break; case 4: ExecEj3.d(cuenta); break;
                 * case 5: ExecEj3.e(); break; } break;
                 */

            }
        }
        scan.close();
    }
}
