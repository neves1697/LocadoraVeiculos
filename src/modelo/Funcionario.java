package modelo;

import java.util.Date;

public class Funcionario extends PessoaFisica {

    protected String ctps;
    protected String cargo;
    protected double salario;

    public Funcionario(String ctps, String cargo, double salario, String cpf, 
            Date dataNascimento, String sexo, String nome, String telefone, 
            String email, Endereco endereco) {
        
        super(cpf, dataNascimento, sexo, nome, telefone, email, endereco);
        this.ctps = ctps;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario() {
        
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
