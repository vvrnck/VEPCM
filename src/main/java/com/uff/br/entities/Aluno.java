package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
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

    @JsonIgnore
    @JoinColumn(name = "idResponsavelAluno", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idAluno")
    private ResponsavelAluno idResponsavelAluno;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "aluno")
    private Set<ListaEspera> listaEspera;

    @JsonIgnore
    @JoinColumn(name = "idSolicitacaoRespAluno", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idAluno")
    private SolicitacaoRespAluno idSolicitacaoRespAluno;



    public Aluno() {    }

    public Aluno(String naturalidade, String nomeMae, String nomePai, Pessoa idPessoa, ResponsavelAluno idResponsavelAluno, Set<ListaEspera> listaEspera, SolicitacaoRespAluno idSolicitacaoRespAluno) {
        this.naturalidade = naturalidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.idPessoa = idPessoa;
        this.idResponsavelAluno = idResponsavelAluno;
        this.listaEspera = listaEspera;
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
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

    public ResponsavelAluno getIdResponsavelAluno() {
        return idResponsavelAluno;
    }

    public void setIdResponsavelAluno(ResponsavelAluno idResponsavelAluno) {
        this.idResponsavelAluno = idResponsavelAluno;
    }

    public Set<ListaEspera> getListaEspera() {
        return listaEspera;
    }

    public void setListaEspera(Set<ListaEspera> listaEspera) {
        this.listaEspera = listaEspera;
    }

    public SolicitacaoRespAluno getIdSolicitacaoRespAluno() {
        return idSolicitacaoRespAluno;
    }

    public void setIdSolicitacaoRespAluno(SolicitacaoRespAluno idSolicitacaoRespAluno) {
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }
}