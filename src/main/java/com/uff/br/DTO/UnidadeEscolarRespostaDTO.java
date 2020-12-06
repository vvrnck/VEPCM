package com.uff.br.DTO;

import com.uff.br.entities.*;

import java.util.Set;

public class UnidadeEscolarRespostaDTO {
    private int id;
    private String nome;
    private int numVagas;
    private String data;
    private Endereco endereco;
    private AnoEscolaridade anoEscolaridade;
    private SolicitacaoRespAluno idSolicitacaoRespAluno;


    private UnidadeEscolarRespostaDTO(int id, String nome, int numVagas, String data, Endereco endereco,  AnoEscolaridade anoEscolaridade, SolicitacaoRespAluno idSolicitacaoRespAluno){
        this.id = id;
        this.nome = nome;
        this.numVagas = numVagas;
        this.data = data;
        this.endereco = endereco;
        this.anoEscolaridade = anoEscolaridade;
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }

    public static UnidadeEscolarRespostaDTO convertToDTO(UnidadeEscolar ue) {
        return new UnidadeEscolarRespostaDTO(ue.getId(), ue.getNome(), ue.getNumVagas(), ue.getData(), ue.getEndereco(), ue.getAnoEscolaridade(), ue.getIdSolicitacaoRespAluno());
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
