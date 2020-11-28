/*
package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UnidadeEscolarAnoEscolaridade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "numVagas")
    private int numVagas;


    @Column(name = "data")
    private String data;

    */
/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadeEscolarAnoEscolaridade")
    private Set<Solicitacao> solicitacao;
*//*

    @JsonIgnore
    @JsonManagedReference(value = "anoEscolaridade-unidadeEscolarAnoEscolaridade")
    @JoinColumn(name = "anoEscolaridade", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private AnoEscolaridade anoEscolaridade;

    @JsonIgnore
    @JsonManagedReference(value = "unidadeEscolar-unidadeEscolarAnoEscolaridade")
    @JoinColumn(name = "unidadeEscolar", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private UnidadeEscolar unidadeEscolar;


    public UnidadeEscolarAnoEscolaridade() {}

    public UnidadeEscolarAnoEscolaridade(String nome, int numVagas, String data, AnoEscolaridade anoEscolaridade, UnidadeEscolar unidadeEscolar){
        this.nome = nome;
        this.numVagas = numVagas;
        this.data = data;
        */
/*this.solicitacao = solicitacao;*//*

        this.anoEscolaridade = anoEscolaridade;
        this.unidadeEscolar = unidadeEscolar;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    */
/*public Set<Solicitacao> getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Set<Solicitacao> solicitacao) {
        this.solicitacao = solicitacao;
    }*//*


    public AnoEscolaridade getAnoEscolaridade() {
        return anoEscolaridade;
    }

    public void setAnoEscolaridade(AnoEscolaridade anoEscolaridade) {
        this.anoEscolaridade = anoEscolaridade;
    }

    public UnidadeEscolar getUnidadeEscolar() {
        return unidadeEscolar;
    }

    public void setUnidadeEscolar(UnidadeEscolar unidadeEscolar) {
        this.unidadeEscolar = unidadeEscolar;
    }
}
*/
