package modelo;

public abstract class Veiculo {
    protected String placa;
    protected String renavam;
    protected int kilometragem;
    protected String cor;
    protected int ano;
    protected double valorDiaria;

    public Veiculo(String placa, String renavam, int kilometragem, 
            String cor, int ano, double valorDiaria) {
        super();
        this.placa = placa;
        this.renavam = renavam;
        this.kilometragem = kilometragem;
        this.cor = cor;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }
    
    public Veiculo(){
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    public abstract double calcularValorPeriodo(int dias);//método que obrigará a implementar
}
