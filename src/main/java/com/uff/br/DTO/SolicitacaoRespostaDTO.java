package com.uff.br.DTO;

import com.uff.br.entities.*;

import java.util.Set;

public class SolicitacaoRespostaDTO {
    private int id;
    private String data;
    private String protocolo;
    private SolicitacaoRespAluno idSolicitacaoRespAluno;

    private SolicitacaoRespostaDTO(int id, String data, String protocolo, SolicitacaoRespAluno idSolicitacaoRespAluno){
        this.id = id;
        this.data = data;
        this.protocolo = protocolo;
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }

    public static SolicitacaoRespostaDTO convertToDTO(Solicitacao solicitacao) {
        return new SolicitacaoRespostaDTO(solicitacao.getId(), solicitacao.getData(), solicitacao.getProtocolo(),  solicitacao.getIdSolicitacaoRespAluno());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
