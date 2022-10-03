package modelo;

public class Modelo {

    private String marca;
    private String modelo;

    public Modelo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Modelo() {
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

    @Override
    public String toString() {
        return "Modelo{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
}
