package modelo;
public class Carro extends Veiculo{
    private int portas;
    private int capacidadePortaMalas;

    public Carro(int portas, int capacidadePortaMalas, String placa, 
            String renavam, int kilometragem, String cor, int ano, double valorDiaria) {
        
        super(placa, renavam, kilometragem, cor, ano, valorDiaria);
        this.portas = portas;
        this.capacidadePortaMalas = capacidadePortaMalas;
    }
    
    public Carro() {
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    } 

    @Override
    public double calcularValorPeriodo(int dias) {
        return 0;
    }
    
    @Override
    public String toString() {
        return "Carro{" + "portas=" + portas + ", capacidadePortaMalas=" 
                + capacidadePortaMalas + '}';
    }
}
