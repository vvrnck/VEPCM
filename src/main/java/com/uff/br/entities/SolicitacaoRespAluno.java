package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Entity
public class SolicitacaoRespAluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "idResponsavel", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Responsavel idResponsavel;

    @JoinColumn(name = "idAluno", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Aluno idAluno;

    @JoinColumn(name = "idSolicitacao", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Solicitacao idSolicitacao;

    @JoinColumn(name = "idUnidadeEscolar", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private UnidadeEscolar idUnidadeEscolar;

    @JoinColumn(name = "idAnoEscolaridade", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private AnoEscolaridade idAnoEscolaridade;

    public SolicitacaoRespAluno() {}

    public SolicitacaoRespAluno(Responsavel idResponsavel, Aluno idAluno, Solicitacao idSolicitacao, UnidadeEscolar idUnidadeEscolar, AnoEscolaridade idAnoEscolaridade){
        this.idResponsavel = idResponsavel;
        this.idAluno = idAluno;
        this.idSolicitacao = idSolicitacao;
        this.idUnidadeEscolar = idUnidadeEscolar;
        this.idAnoEscolaridade = idAnoEscolaridade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Responsavel getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Responsavel idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public Aluno getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Aluno idAluno) {
        this.idAluno = idAluno;
    }

    public Solicitacao getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(Solicitacao idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    public UnidadeEscolar getIdUnidadeEscolar() {
        return idUnidadeEscolar;
    }

    public void setIdUnidadeEscolar(UnidadeEscolar idUnidadeEscolar) {
        this.idUnidadeEscolar = idUnidadeEscolar;
    }

    public AnoEscolaridade getIdAnoEscolaridade() {
        return idAnoEscolaridade;
    }

    public void setIdAnoEscolaridade(AnoEscolaridade idAnoEscolaridade) {
        this.idAnoEscolaridade = idAnoEscolaridade;
    }
}



