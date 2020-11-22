package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private String numero;

    @Column(name = "cep")
    private String cep;

    @Column(name = "uf")
    private String uf;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "bairro")
    private String bairro;

    @JsonBackReference(value = "endereco-pessoa")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "endereco")
    private Pessoa pessoa;

    @JsonBackReference(value = "endereco-unidade")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "endereco")
    private UnidadeEscolar unidadeEscolar;

    public Endereco() {}

    public Endereco(String logradouro, String numero, String cep, String uf, String municipio, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.uf = uf;
        this.municipio = municipio;
        this.bairro = bairro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
//
//    public UnidadeEscolar getUnidadeEscolar() {
//        return unidadeEscolar;
//    }
//
//    public void setUnidadeEscolar(UnidadeEscolar unidadeEscolar) {
//        this.unidadeEscolar = unidadeEscolar;
//    }


    public UnidadeEscolar getUnidadeEscolar() {
        return unidadeEscolar;
    }

    public void setUnidadeEscolar(UnidadeEscolar unidadeEscolar) {
        this.unidadeEscolar = unidadeEscolar;
    }
}
