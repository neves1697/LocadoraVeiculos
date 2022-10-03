package Controller;
import java.text.ParseException;
import util.Input;
import java.util.ArrayList;
import modelo.Contrato;
import modelo.Veiculo;
import modelo.Pessoa;
import util.DateUtils;
import modelo.Funcionario;



public class CadastroContrato {
    public static Contrato cadastroContrato(Pessoa cliente, Funcionario funcionario, Veiculo veiculo){
        Contrato con = new Contrato();
        
        System.out.println("Digite a data de início do contrato: Máscara DD/MM/YYYY");
        con.setDataInicio(Input.leitorData());
        
        System.out.println("Digite a data de final do contrato: Máscara DD/MM/YYYY");
        con.setDataTermino(Input.leitorData());
        con.setCliente(cliente);
        
        System.out.println("Digite o valor da locação:");
        con.setValorLocacaoVeiculo(Input.leitor.nextInt());
        
        return null;
    }
}
