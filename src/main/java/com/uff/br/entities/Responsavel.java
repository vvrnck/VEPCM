package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import java.util.Set;

@Entity
public class Responsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference(value = "pessoa-Responsavel")
    @JoinColumn(name = "idPessoa", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Pessoa idPessoa;

    @JsonIgnore
    @JoinColumn(name = "idResponsavelAluno", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idResponsavel")
    private ResponsavelAluno idResponsavelAluno;

    @JsonIgnore
    @JoinColumn(name = "idSolicitacaoRespAluno", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idResponsavel")
    private SolicitacaoRespAluno idSolicitacaoRespAluno;


    public Responsavel() {}

    public Responsavel(Pessoa idPessoa, ResponsavelAluno idResponsavelAluno, SolicitacaoRespAluno idSolicitacaoRespAluno) {

        this.idPessoa = idPessoa;
        this.idResponsavelAluno = idResponsavelAluno;
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public SolicitacaoRespAluno getIdSolicitacaoRespAluno() {
        return idSolicitacaoRespAluno;
    }

    public void setIdSolicitacaoRespAluno(SolicitacaoRespAluno idSolicitacaoRespAluno) {
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }
}
