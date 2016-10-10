/**
 * Created by usu32 on 05/10/2016.
 */
public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private double coste;

    public Coche(String matricula, String marca, String modelo, double coste) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.coste = coste;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", coste=" + coste +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coche coche = (Coche) o;

        if (Double.compare(coche.coste, coste) != 0) return false;
        if (!matricula.equals(coche.matricula)) return false;
        if (!marca.equals(coche.marca)) return false;
        return modelo.equals(coche.modelo);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = matricula.hashCode();
        result = 31 * result + marca.hashCode();
        result = 31 * result + modelo.hashCode();
        temp = Double.doubleToLongBits(coste);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
