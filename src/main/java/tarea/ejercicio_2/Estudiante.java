package tarea.ejercicio_2;

public class Estudiante extends Persona {

    private int fechaIngreso;
    private double cuota;
    private String carrera;

    public Estudiante() {
        super();
    }

    public Estudiante(String dni, String nombre, String apellido, String email, String direccion, int fechaIngreso, double cuota, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.fechaIngreso = fechaIngreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public int getIngreso() {
        return this.fechaIngreso;
    }

    public double getCuota() {
        return this.cuota;
    }

    public String getCarrera() {
        return this.carrera;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + " ingreso='" + getIngreso() + "'" + ", cuota='" + getCuota() + "'"
                + ", carrera='" + getCarrera() + "'" + "}";
    }

}