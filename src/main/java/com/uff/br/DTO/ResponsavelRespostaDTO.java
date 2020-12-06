package com.uff.br.DTO;

import com.uff.br.entities.*;

import java.util.Set;

public class ResponsavelRespostaDTO {
    private int id;
    private Pessoa idPessoa;
    private ResponsavelAluno idResponsavelAluno;
    private SolicitacaoRespAluno idSolicitacaoRespAluno;

    private ResponsavelRespostaDTO(int id, Pessoa idPessoa, ResponsavelAluno idResponsavelAluno, SolicitacaoRespAluno idSolicitacaoRespAluno){
        this.id = id;
        this.idPessoa = idPessoa;
        this.idResponsavelAluno = idResponsavelAluno;
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }

    public static ResponsavelRespostaDTO convertToDTO(Responsavel responsavel) {
        return new ResponsavelRespostaDTO(responsavel.getId(), responsavel.getIdPessoa(), responsavel.getIdResponsavelAluno(), responsavel.getIdSolicitacaoRespAluno());
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
