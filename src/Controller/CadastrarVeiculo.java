package Controller;

import modelo.Caminhao;
import modelo.Carro;
import modelo.Moto;
import modelo.Veiculo;
import util.Input;

public class CadastrarVeiculo {

    /*
    protected String placa;
    protected String renavam;
    protected int kilometragem;
    protected String cor;
    protected int ano;
    protected double valorDiaria;
     */
    public static Veiculo cadastrarVeiculo() {
        int aux = 0;
        Veiculo veiculo = null;
        System.out.println("Informe o tipo do veiculo para cadastro\n"
                + "1 - Cadastrar Carro\n"
                + "2 - Cadastrar caminhão\n"
                + "3 - Cadastrar moto\n");
        aux = Input.nextInt();
        do {
            switch (aux) {
                case 1:
                    veiculo = new Moto();
                    break;
                case 2:
                    veiculo= new Carro();
                    break;
                case 3:
                    veiculo = new Caminhao();
                    break;
                case 0:
                    System.out.println("Cadastro cancelado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (aux > 3 && aux < 0);

        if (veiculo == null) {
            return null;
        } else {
            gravarDadosDoVeiculo(veiculo);
            return veiculo;
        }
    }

    public static void gravarDadosDoVeiculo(Veiculo veiculo) {
        System.out.println("Digite a placa:");
        veiculo.setPlaca(Input.nextLine());
        
        System.out.println("Digite o RENAVAM:");
        veiculo.setPlaca(Input.nextLine());
        
        System.out.println("Digite a kilometragem:");
        veiculo.setKilometragem(Input.nextInt());
        
        System.out.println("Digite a placa:");
        veiculo.setPlaca(Input.nextLine());
        
        System.out.println("Digite a placa:");
        veiculo.setPlaca(Input.nextLine());
        
        System.out.println("Digite a placa:");
        veiculo.setPlaca(Input.nextLine());
    }
}
