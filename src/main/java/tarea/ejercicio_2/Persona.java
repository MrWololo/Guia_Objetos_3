package tarea.ejercicio_2;

public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido, String email, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }

    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public String toString() {
        return "{" + " dni='" + getDni() + "'" + ", nombre='" + getNombre() + "'" + ", apellido='" + getApellido() + "'"
                + ", email='" + getEmail() + "'" + ", direccion='" + getDireccion() + "'" + "}";
    }
}