package tarea.ejercicio_3;

public class Cuadrado extends Figura {

    private double ladoLong;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double ladoLong) {
        super();
        this.ladoLong = ladoLong;
    }

    public Cuadrado(String color, double ladoLong) {
        super(color);
        this.ladoLong = ladoLong;
    }

    public double getLadoLong() {
        return this.ladoLong;
    }

    @Override
    public double getArea() {
        return Math.pow(ladoLong, 2);
    }

    @Override
    public double getPerimetro() {
        return ladoLong*4;
    }

    @Override
    public String toString() {
        return "Cuadrado= {" + " color='" + getColor() + "'" + " ladoLong='" + getLadoLong() + "'" + "}";
    }

}