package com.uff.br.DTO;

import com.uff.br.entities.*;

import java.util.Set;

public class AnoEscolaridadeRespostaDTO {
    private int id;
    private String nome;
    private String descricao;
    private Set<UnidadeEscolar> unidadeEscolar;
    private SolicitacaoRespAluno idSolicitacaoRespAluno;


    private AnoEscolaridadeRespostaDTO(int id, String nome, String descricao, Set<UnidadeEscolar> unidadeEscolar, SolicitacaoRespAluno idSolicitacaoRespAluno){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.unidadeEscolar = unidadeEscolar;
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }

    public static AnoEscolaridadeRespostaDTO convertToDTO(AnoEscolaridade ae) {
        return new AnoEscolaridadeRespostaDTO(ae.getId(), ae.getNome(), ae.getDescricao(), ae.getUnidadeEscolar(), ae.getIdSolicitacaoRespAluno());
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String data) {
        this.descricao = descricao;
    }

    public Set<UnidadeEscolar> getUnidadeEscolar() {
        return unidadeEscolar;
    }

    public void setUnidadeEscolar(Set<UnidadeEscolar> unidadeEscolar) {
        this.unidadeEscolar = unidadeEscolar;
    }

    public SolicitacaoRespAluno getIdSolicitacaoRespAluno() {
        return idSolicitacaoRespAluno;
    }

    public void setIdSolicitacaoRespAluno(SolicitacaoRespAluno idSolicitacaoRespAluno) {
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }
}
