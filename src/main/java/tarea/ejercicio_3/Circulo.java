package tarea.ejercicio_3;

import java.text.DecimalFormat;

public class Circulo extends Figura {

    DecimalFormat df = new DecimalFormat("###.##");
    private double radio;

    public Circulo() {
        super();
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public String toString() {
        return "Circulo= {" + " color='" + getColor() + "'" + " radio='" + getRadio() + "'" + " Area='"
                + df.format(getArea()) + "'" + " Perimetro='" + df.format(getPerimetro()) + "'" + "}";
    }
}