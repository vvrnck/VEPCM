package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Entity
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "data")
    private String data;

    @Column(name = "protocolo")
    private String protocolo;

    @JsonIgnore
    @JoinColumn(name = "idSolicitacaoRespAluno", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idSolicitacao")
    private SolicitacaoRespAluno idSolicitacaoRespAluno;

    public Solicitacao() {
    }

    public Solicitacao(String data, String protocolo, SolicitacaoRespAluno idSolicitacaoRespAluno) {
        this.data = data;
        this.protocolo = protocolo;
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public SolicitacaoRespAluno getIdSolicitacaoRespAluno() {
        return idSolicitacaoRespAluno;
    }

    public void setIdSolicitacaoRespAluno(SolicitacaoRespAluno idSolicitacaoRespAluno) {
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }
}

