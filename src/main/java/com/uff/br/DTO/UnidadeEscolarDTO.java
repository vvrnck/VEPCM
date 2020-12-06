package com.uff.br.DTO;

import com.uff.br.entities.AnoEscolaridade;
import com.uff.br.entities.Endereco;
import com.uff.br.entities.SolicitacaoRespAluno;
import com.uff.br.entities.UnidadeEscolar;



import java.util.Set;

public class UnidadeEscolarDTO {
    private String nome;
    private int numVagas;
    private String data;
    private Endereco endereco;
    private AnoEscolaridade anoEscolaridade;
    private SolicitacaoRespAluno idSolicitacaoRespAluno;


    public UnidadeEscolar convertToObject() {
        return new UnidadeEscolar(nome, numVagas, data, endereco, anoEscolaridade, idSolicitacaoRespAluno);
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
