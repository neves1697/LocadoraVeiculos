package Controller;
import util.Input;
import modelo.Endereco;
public class CadastroEndereco {
    public static Endereco cadastro(){
        Endereco end = new Endereco();
        setaInformacoes(end);
        return end;
    }
    
    public static void setaInformacoes(Endereco end){
        if(end == null){
            System.out.println("Falha no carregamento do Endereco");
            return;
        }
        
        System.out.println("Cidade: ");
        end.setCidade(Input.leitorStrings.nextLine());
        
        System.out.println("Rua: ");
        end.setRua(Input.leitorStrings.nextLine());
        
        System.out.println("Número: ");
        end.setNumero(Input.leitor.nextInt());
    }
}
