package modelo;

import util.DateUtils;
import java.time.LocalDate;

public abstract class Pessoa implements Comparable<Pessoa> {

    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Pessoa() {
        this.endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // métodos abstratos
    public abstract String getDocumento();

    public abstract String getTipoPessoa();
    
    // set de informações
    
    public void exibirInformacoes(){
        System.out.print(nome + " Email: "+ email + " Telefone: " + telefone);
        endereco.exibirInformacoes();
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone="
                + telefone + ", email=" + email
                + ", endereco=" + endereco + '}';
    }
    
    @Override
    public int compareTo(Pessoa outraPessoa) {
        return nome.compareTo(outraPessoa.getNome());
    }
    
}
