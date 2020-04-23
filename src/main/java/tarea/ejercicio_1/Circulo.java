package tarea.ejercicio_1;

import java.text.DecimalFormat;

public class Circulo {
    public DecimalFormat df = new DecimalFormat("###.##");

    private double radio = 1.0;
    private String color = "rojo";

    public Circulo() {
    }

    public Circulo(final double radio) {
        this.radio = radio;
    }

    public Circulo(final double radio, final String color) {
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
        final double area = (Math.pow(this.radio, 2) * Math.PI);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo: {" + "radio='" + df.format(getRadio()) + "'" + ", area='" + df.format(getArea()) + "'" + "}";
    }

}