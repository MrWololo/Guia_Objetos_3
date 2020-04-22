package tarea.ejercicio_1;

public class Cilindro extends Circulo {

    private double altura = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getVolumen() {
        return super.getArea() * this.altura;
    }

    @Override
    public double getArea() {
        return ((2 * Math.PI * getRadio() * getAltura()) + (2 * super.getArea()));
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de " + super.toString() + " altura='" + df.format(getAltura()) + "'";
    }

}