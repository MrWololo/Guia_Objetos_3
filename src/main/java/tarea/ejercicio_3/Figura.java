package tarea.ejercicio_3;

public abstract class Figura {

    private String color;

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

}