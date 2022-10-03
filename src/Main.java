
import Controller.CadastroContrato;
import Controller.CadastroEndereco;
import modelo.Funcionario;
import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.Veiculo;


public class Main {

    public static void main(String[] args) {
        CadastroEndereco ce = new CadastroEndereco();
        //ce.cadastro();
        Pessoa cliente = new PessoaFisica();
        Funcionario funcionario = new Funcionario();
        //Veiculo veiculo = new Veiculo();
        //CadastroContrato.cadastroContrato(cliente, funcionario, veiculo);
    }
    
}