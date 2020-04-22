package tarea.ejercicio_2;

public class Staff extends Persona {

    private int salario;
    private char turno;

    public Staff() {
        super();
    }

    public Staff(String dni, String nombre, String apellido, String email, String direccion, int salario, char turno) {
        super(dni, nombre, apellido, email, direccion);
        assert Character.toLowerCase(turno) == 'm'
                || Character.toLowerCase(turno) == 'n' : "Los turnos solo pueden ser 'M' o 'N'";
        this.salario = salario;
        this.turno = turno;
    }

    public int getSalario() {
        return this.salario;
    }

    public double getTurno() {
        return this.turno;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + " ingreso='" + getSalario() + "'" + ", cuota='" + getTurno() + "'" + "'" + "}";
    }

}