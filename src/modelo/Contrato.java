package modelo;

import java.util.Date;
import java.time.ZoneId;
import java.util.Date;

public class Contrato {
    private int id;
    private Date dataInicio;
    private Date dataTermino;
    private String situacao;
    private double valorLocacaoVeiculo;
    private double valorSeguro;
    private Pessoa cliente;
    private Funcionario funcionario;

    public Contrato(int id, Date dataInicio, Date dataTermino, String situacao, double valorLocacaoVeiculo, double valorSeguro, Pessoa cliente, Funcionario funcionario) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.situacao = situacao;
        this.valorLocacaoVeiculo = valorLocacaoVeiculo;
        this.valorSeguro = valorSeguro;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public Contrato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public double getValorLocacaoVeiculo() {
        return valorLocacaoVeiculo;
    }

    public void setValorLocacaoVeiculo(double valorLocacaoVeiculo) {
        this.valorLocacaoVeiculo = valorLocacaoVeiculo;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    /*public double calcularValorTotal(){
        //int dias = diasLocacao();
        
    }*/
    
    


}
