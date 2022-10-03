package modelo;

import java.util.List;

public class Versao {

    private String nome;
    private String motor;
    private String tipoCombustivel;
    private List<String> intesSerie;
    private Modelo modelo;

    public Versao() {
    }

    public Versao(String nome, String motor, String tipoCombustivel,
            List<String> intesSerie, Modelo modelo) {
        
        this.nome = nome;
        this.motor = motor;
        this.tipoCombustivel = tipoCombustivel;
        this.intesSerie = intesSerie;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public List<String> getIntesSerie() {
        return intesSerie;
    }

    public void setIntesSerie(List<String> intesSerie) {
        this.intesSerie = intesSerie;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Versao{" + "nome=" + nome + ", motor=" + motor
                + ", tipoCombustivel="
                + tipoCombustivel + ", intesSerie=" + intesSerie
                + ", modelo=" + modelo + '}';
    }

}
