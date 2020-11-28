/*
package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Entity
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "protocolo")
    private String protocolo;

    @JoinColumn(name = "idAluno", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Aluno idAluno;

    @JoinColumn(name = "idResponsavel", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Responsavel idResponsavel;

    @JoinColumns({
       @JoinColumn(name = "idUnidadeEscolar", referencedColumnName = "idUnidadeEscolar")
     , @JoinColumn(name = "idAnoEscolaridade", referencedColumnName = "idAnoEscolaridade")})
    @ManyToOne(cascade = CascadeType.ALL)
    private  UnidadeEscolarAnoEscolaridade unidadeEscolarAnoEscolaridade;


   */
/* @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitacao")
    private Set<SolicitacaoResponsavel> solicitacaoResponsavel;
*//*

   public Solicitacao() {}

    public Solicitacao(String protocolo, Aluno idAluno, Responsavel idResponsavel, UnidadeEscolarAnoEscolaridade unidadeEscolarAnoEscolaridade){
        this.protocolo = protocolo;
        this.idAluno = idAluno;
        this.idResponsavel = idResponsavel;
        this.unidadeEscolarAnoEscolaridade = unidadeEscolarAnoEscolaridade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Aluno getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Aluno idAluno) {
        this.idAluno = idAluno;
    }

    public Responsavel getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Responsavel idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public UnidadeEscolarAnoEscolaridade getUnidadeEscolarAnoEscolaridade() {
        return unidadeEscolarAnoEscolaridade;
    }

    public void setUnidadeEscolarAnoEscolaridade(UnidadeEscolarAnoEscolaridade unidadeEscolarAnoEscolaridade) {
        this.unidadeEscolarAnoEscolaridade = unidadeEscolarAnoEscolaridade;
    }
}



*/
