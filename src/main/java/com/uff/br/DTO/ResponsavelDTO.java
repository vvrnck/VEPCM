package com.uff.br.DTO;

import com.uff.br.entities.Pessoa;
import com.uff.br.entities.Responsavel;
import com.uff.br.entities.ResponsavelAluno;
import com.uff.br.entities.SolicitacaoRespAluno;


public class ResponsavelDTO {
    private Pessoa idPessoa;
    private ResponsavelAluno idResponsavelAluno;
    private SolicitacaoRespAluno idSolicitacaoRespAluno;

    public Responsavel convertToObject() {
        return new Responsavel(idPessoa, idResponsavelAluno, idSolicitacaoRespAluno);
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
