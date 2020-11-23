package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "naturalidade")
    private String naturalidade;

    @Column(name = "nomeMae")
    private String nomeMae;

    @Column(name = "nomePai")
    private String nomePai;

    @JsonBackReference(value = "aluno-pessoa")
    @JoinColumn(name = "idPessoa", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Pessoa idPessoa;


    @JoinColumn(name = "idResponsavel", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Pessoa idResponsavel;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
//    private Collection<ListaEspera> listaEsperaCollection;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
//    private Collection<Solicitacao> solicitacaoCollection;
//


    public Aluno() {    }

    public Aluno(String naturalidade, String nomeMae, String nomePai, Pessoa idPessoa, Pessoa idResponsavel) {
        this.naturalidade = naturalidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.idPessoa = idPessoa;
        this.idResponsavel = idResponsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Pessoa getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Pessoa getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Pessoa idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

}