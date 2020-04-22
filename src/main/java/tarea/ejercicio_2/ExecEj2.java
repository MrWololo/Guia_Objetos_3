package tarea.ejercicio_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class ExecEj2 {

    public static ArrayList<Estudiante> a() {
        ArrayList<Estudiante> lista = new ArrayList<Estudiante>();

        Estudiante uno = new Estudiante("1000000", "uno", "dos", "unodos@mail.com", "unodos 1212", 2017, 2000,
                "Programacion");
        Estudiante dos = new Estudiante("2000000", "dos", "tres", "dostres@mail.com", "dostres 2323", 2016, 3000,
                "Programacion");
        Estudiante tres = new Estudiante("3000000", "tres", "cuatro", "trescuatro@mail.com", "trescuatro 3434", 2015,
                4000, "Data Analysis");
        Estudiante cuatro = new Estudiante("4000000", "cuatro", "cinco", "cuatrocinco@mail.com", "cuatrocinco 4545",
                2018, 5000, "Data Analysis");

        Collections.addAll(lista, uno, dos, tres, cuatro);

        return lista;
    }

    public static ArrayList<Staff> b() {

        ArrayList<Staff> lista = new ArrayList<Staff>();

        Staff sUno = new Staff("1000000", "uno", "dos", "unodos@mail.com", "unodos 1212", 15000, 'n');
        Staff sDos = new Staff("2000000", "dos", "tres", "dostres@mail.com", "dostres 2323", 25000, 'm');
        Staff sTres = new Staff("3000000", "tres", "cuatro", "trescuatro@mail.com", "trescuatro 3434", 35000, 'n');
        Staff sCuatro = new Staff("4000000", "cuatro", "cinco", "cuatrocinco@mail.com", "cuatrocinco 4545", 40000, 'm');

        Collections.addAll(lista, sUno, sDos, sTres, sCuatro);

        return lista;

    }

    public static ArrayList<Persona> c(ArrayList<Estudiante> estudiantes, ArrayList<Staff> staff) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        Stream.of(estudiantes, staff).forEach(personas::addAll);

        return personas;
    }

    public static int d(ArrayList<Persona> lista) {
        int cantEst = 0;

        for (Persona persona : lista) {
            if (persona instanceof Estudiante) {
                cantEst++;
            }
        }
        
        return cantEst;
        //System.out.println("Estudiantes: " + cantEst + ", Staff: " + cantStaff);

    }

    public static double e(ArrayList<Persona> lista) {

        double ingresos = 0;
        for (Persona persona : lista) {
            if (persona instanceof Estudiante) {
                ingresos += ((Estudiante) persona).getCuota();
            }
        }
        return ingresos;
    }
}