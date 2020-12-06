package com.uff.br.DTO;

import com.uff.br.entities.*;

import java.util.Set;

public class SolicitacaoRespAlunoRespostaDTO {
    private int id;
    private Responsavel idResponsavel;
    private Aluno idAluno;
    private Solicitacao idSolicitacao;
    private UnidadeEscolar idUnidadeEscolar;
    private AnoEscolaridade idAnoEscolaridade;

    private SolicitacaoRespAlunoRespostaDTO(int id, Responsavel idResponsavel, Aluno idAluno, Solicitacao idSolicitacao, UnidadeEscolar idUnidadeEscolar, AnoEscolaridade idAnoEscolaridade){
        this.id = id;
        this.idResponsavel = idResponsavel;
        this.idAluno = idAluno;
        this.idSolicitacao = idSolicitacao;
        this.idUnidadeEscolar = idUnidadeEscolar;
        this.idAnoEscolaridade = idAnoEscolaridade;
    }

    public static SolicitacaoRespAlunoRespostaDTO convertToDTO(SolicitacaoRespAluno solicitacaoRespAluno) {
        return new SolicitacaoRespAlunoRespostaDTO(solicitacaoRespAluno.getId(), solicitacaoRespAluno.getIdResponsavel(), solicitacaoRespAluno.getIdAluno(), solicitacaoRespAluno.getIdSolicitacao(), solicitacaoRespAluno.getIdUnidadeEscolar(), solicitacaoRespAluno.getIdAnoEscolaridade());
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
