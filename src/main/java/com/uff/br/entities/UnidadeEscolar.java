package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UnidadeEscolar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "numVagas")
    private int numVagas;

    @Column(name = "data")
    private String data;

    @JsonManagedReference(value = "endereco-unidade")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco", referencedColumnName = "id")
    private Endereco endereco;

    @JsonIgnore
    @JoinColumn(name = "anoEscolaridade", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private AnoEscolaridade anoEscolaridade;

    @JsonIgnore
    @JoinColumn(name = "idSolicitacaoRespAluno", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idUnidadeEscolar")
    private SolicitacaoRespAluno idSolicitacaoRespAluno;



/*
    @JsonIgnore
    @JsonBackReference(value = "unidadeEscolar-unidadeEscolarAnoEscolaridade")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "unidadeEscolar")
    private Set<UnidadeEscolarAnoEscolaridade> unidadeEscolarAnoEscolaridade;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "unidadeEscolar_anoEscolaridade", joinColumns = @JoinColumn(name = "idUnidadeEscolar"), inverseJoinColumns = @JoinColumn(name ="idAnoEscolaridade"))
    private Set<AnoEscolaridade> anoEscolaridade;
*/

    public UnidadeEscolar() {}

    public UnidadeEscolar(String nome, int numVagas, String data, Endereco endereco, AnoEscolaridade anoEscolaridade, SolicitacaoRespAluno idSolicitacaoRespAluno){
        this.nome = nome;
        this.numVagas = numVagas;
        this.data = data;
        this.endereco = endereco;
        this.anoEscolaridade = anoEscolaridade;
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public AnoEscolaridade getAnoEscolaridade() {
        return anoEscolaridade;
    }

    public void setAnoEscolaridade(AnoEscolaridade anoEscolaridade) {
        this.anoEscolaridade = anoEscolaridade;
    }

    public SolicitacaoRespAluno getIdSolicitacaoRespAluno() {
        return idSolicitacaoRespAluno;
    }

    public void setIdSolicitacaoRespAluno(SolicitacaoRespAluno idSolicitacaoRespAluno) {
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }
}
