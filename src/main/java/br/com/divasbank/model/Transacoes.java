package br.com.divasbank.model;

public class Transacoes {
    private Integer idTransacao;
    private Double valor;
    private String dataTransferencia;

    Conta conta;

    public Transacoes(Integer idTransacao, Double valor, String dataTransferencia, Conta conta) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.dataTransferencia = dataTransferencia;
        this.conta = conta;
    }

    public void saque() {
        System.out.println("Saque realizado com Sucesso");
    }

    public void deposito() {
        System.out.println("Deposito realizado com Sucesso");
    }

    public void transferencia() {
        System.out.println("Transferencia realizada com Sucesso");
    }


    public Integer getIdTransacao() {

        return idTransacao;
    }

    public void setIdTransacao(Integer idTransacao) {

        this.idTransacao = idTransacao;
    }

    public Double getValor() {

        return valor;
    }

    public void setValor(Double valor) {

        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(String dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }
}
