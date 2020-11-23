package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
    private Set<ListaEspera> listaEspera;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
//    private Collection<Solicitacao> solicitacaoCollection;
//


    public Aluno() {    }

    public Aluno(String naturalidade, String nomeMae, String nomePai, Pessoa idPessoa, Pessoa idResponsavel, Set<ListaEspera> listaEspera) {
        this.naturalidade = naturalidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.idPessoa = idPessoa;
        this.idResponsavel = idResponsavel;
        this.listaEspera = listaEspera;
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

    public Set<ListaEspera> getListaEspera() {
        return listaEspera;
    }

    public void setListaEspera(Set<ListaEspera> listaEspera) {
        this.listaEspera = listaEspera;
    }
}