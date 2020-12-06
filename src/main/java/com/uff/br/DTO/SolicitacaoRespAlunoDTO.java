package com.uff.br.DTO;


import com.uff.br.entities.*;
import com.uff.br.utils.TipoUsuario;

public class SolicitacaoRespAlunoDTO {
    private Responsavel idResponsavel;
    private Aluno idAluno;
    private Solicitacao idSolicitacao;
    private UnidadeEscolar idUnidadeEscolar;
    private AnoEscolaridade idAnoEscolaridade;


    public SolicitacaoRespAluno convertToObject() {
        return new SolicitacaoRespAluno(idResponsavel, idAluno, idSolicitacao, idUnidadeEscolar, idAnoEscolaridade);
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
