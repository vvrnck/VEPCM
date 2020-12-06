package com.uff.br.DTO;

import com.uff.br.entities.*;


public class SolicitacaoDTO {
    private String data;
    private String protocolo;
    private SolicitacaoRespAluno idSolicitacaoRespAluno;

    public Solicitacao convertToObject() {
        return new Solicitacao (data, protocolo, idSolicitacaoRespAluno);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public SolicitacaoRespAluno getIdSolicitacaoRespAluno() {
        return idSolicitacaoRespAluno;
    }

    public void setIdSolicitacaoRespAluno(SolicitacaoRespAluno idSolicitacaoRespAluno) {
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }
}
