package com.uff.br.DTO;


import com.uff.br.entities.*;

import java.util.Set;


public class AlunoDTO {
    private String naturalidade;
    private String nomeMae;
    private String nomePai;
    private Pessoa idPessoa;
    private ResponsavelAluno idResponsavelAluno;
    private Set<ListaEspera> listaEspera;
    private SolicitacaoRespAluno idSolicitacaoRespAluno;

    public Aluno convertToObject() {
        return new Aluno (naturalidade, nomeMae, nomePai, idPessoa, idResponsavelAluno, listaEspera, idSolicitacaoRespAluno);
    }
    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
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

    public Set<ListaEspera> getListaEspera() {
        return listaEspera;
    }

    public void setListaEspera(Set<ListaEspera> listaEspera) {
        this.listaEspera = listaEspera;
    }

    public SolicitacaoRespAluno getIdSolicitacaoRespAluno() {
        return idSolicitacaoRespAluno;
    }

    public void setIdSolicitacaoRespAluno(SolicitacaoRespAluno idSolicitacaoRespAluno) {
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }
}
