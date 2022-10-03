package modelo;

import java.util.Date;

public class PessoaFisica extends Pessoa{
    protected String cpf;
    protected Date dataNascimento;
    protected String sexo;

    public PessoaFisica(String cpf, Date dataNascimento, String sexo, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public PessoaFisica() {
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getDocumento() {
        return this.cpf;
    }

    @Override
    public String getTipoPessoa() {
        return "PF";
    }
    
}
