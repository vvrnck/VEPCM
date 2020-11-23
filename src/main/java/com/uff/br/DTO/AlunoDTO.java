package com.uff.br.DTO;


import com.uff.br.entities.Aluno;
import com.uff.br.entities.Pessoa;


public class AlunoDTO {
    private String naturalidade;
    private String nomeMae;
    private String nomePai;
    private Pessoa idPessoa;
    private Pessoa idResponsavel;

    public Aluno convertToObject() {
        return new Aluno (naturalidade, nomeMae, nomePai, idPessoa, idResponsavel);
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

    public Pessoa getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Pessoa idResponsavel) {
        this.idResponsavel = idResponsavel;
    }
}
