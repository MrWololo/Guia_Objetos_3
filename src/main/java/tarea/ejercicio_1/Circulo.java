package tarea.ejercicio_1;

public class Circulo {
    private double radio = 1.0;
    private String color = "rojo";

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return this.radio;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        double area = (Math.pow(this.radio, 2) * Math.PI);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo: {" + "radio='" + getRadio() + "'" + ", area='" + getArea() + "'"
                + "}";
    }

}