package modelo;

import modelo.Versao;

public class Caminhao extends Veiculo {

    Versao versao;
    private int eixos;
    private double capacidadeCarga;

    public Caminhao(int eixos, double capacidadeCarga, String placa,
            String renavam, int kilometragem, String cor, int ano, double valorDiaria) {
        //
        super(placa, renavam, kilometragem, cor, ano, valorDiaria);
        this.eixos = eixos;
        this.capacidadeCarga = capacidadeCarga;
    }

    public Caminhao() {

    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    //método abstrato da classe veículo
    @Override
    public double calcularValorPeriodo(int dias) {
        return 0;
    }

    @Override
    public String toString() {
        return "\n Caminhao: {"
                + "\n   eixos: " + eixos + ", "
                + "\n   capacidadeCarga: " + capacidadeCarga
                + "\n   placa: " + placa + ", "
                + "\n   renavam: " + renavam + ", "
                + "\n   quilometragem: " + kilometragem + ", "
                + "\n   cor:" + cor + ", "
                + "\n   ano:" + ano + ", "
                + "\n   valorDiaria: " + valorDiaria
                + "\n   versao: {"
                + "\n     nome: " + versao.getNome() + ", "
                + "\n     motor: " + versao.getMotor() + ", "
                + "\n     tipoCombustivel: " + versao.getTipoCombustivel() + ", "
                + "\n     intesSerie: " + versao.getIntesSerie() + ", "
                + "\n     modelo: {"
                + "\n       marca: " + versao.getModelo().getMarca() + ", "
                + "\n       modelo: " + versao.getModelo().getModelo()
                + "\n     },"
                + "\n },";
    }
}
