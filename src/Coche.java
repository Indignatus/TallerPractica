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


}
