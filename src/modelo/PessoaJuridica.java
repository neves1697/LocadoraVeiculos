package modelo;
import java.util.Date;

public class PessoaJuridica extends Pessoa{
    protected String cnpj;
    protected String razaoSocial;
    protected Date dataAbertura;

    public PessoaJuridica(String cnpj, String razaoSocial, Date dataAbertura, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.dataAbertura = dataAbertura;
    }

    public PessoaJuridica() {
        
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    @Override
    public String getDocumento() {
        return this.cnpj;
    }

    @Override
    public String getTipoPessoa() {
       return "PJ";
    }
}
