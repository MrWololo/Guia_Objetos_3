package tarea.ejercicio_3;

public class Rectangulo extends Figura {

    private double alto;
    private double largo;

    public Rectangulo() {
        super();
    }

    public Rectangulo(double alto, double largo) {
        super();
        this.alto = alto;
        this.largo = largo;
    }

    public Rectangulo(String color, double alto, double largo) {
        super(color);
        this.alto = alto;
        this.largo = largo;
    }

    public double getAlto() {
        return this.alto;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getArea() {
        return this.alto * this.largo;
    }

    public double getPerimetro() {
        return 2 * (this.alto + this.largo);
    }

    @Override
    public String toString() {
        return "Rectangulo= {" + ", color='" + getColor() + "'" + " alto='" + getAlto() + "'" + ", largo='" + getLargo() + "'"
                + ", Area='" + getArea() + "'" + ", Perimetro='" + getPerimetro() + "'" + "}";
    }

}