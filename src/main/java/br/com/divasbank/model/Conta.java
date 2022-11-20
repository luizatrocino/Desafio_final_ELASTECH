package br.com.divasbank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@DynamicUpdate
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long numero;
    private Integer digito;
    private Double saldo;

    //private Boolean verificaChequeEspecial;
    //private Double chequeEspecial;
    private Boolean ativo;

    public Conta() {
    }

    public Conta(Long id, Long numero, Integer digito, Double saldo, Boolean verificaChequeEspecial, Double chequeEspecial, Boolean ativo) {
        this.id = id;
        this.numero = numero;
        this.digito = digito;
        this.saldo = saldo;
//        this.verificaChequeEspecial = verificaChequeEspecial;
//        this.chequeEspecial = chequeEspecial;
        this.ativo = ativo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getNumero(Long numeroContaDestino) {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(id, conta.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
