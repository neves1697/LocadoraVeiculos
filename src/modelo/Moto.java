package modelo;
import modelo.Veiculo;
public class Moto extends Veiculo{

    public Moto(String placa, String renavam, int kilometragem, String cor, 
            int ano, double valorDiaria) {
        
        super(placa, renavam, kilometragem, cor, ano, valorDiaria);
    }

    public Moto() {
        
    }
    
    @Override
    public double calcularValorPeriodo(int dias) {
        return 0;
    }
  
}
