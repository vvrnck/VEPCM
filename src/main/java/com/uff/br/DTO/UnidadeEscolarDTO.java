package com.uff.br.DTO;

import com.uff.br.entities.AnoEscolaridade;
import com.uff.br.entities.Endereco;
import com.uff.br.entities.UnidadeEscolar;

import java.util.Collection;
import java.util.Set;

public class UnidadeEscolarDTO {
    private String nome;
    private int numVagas;
    private String data;
    private Endereco endereco;
    private Set<AnoEscolaridade> anoEscolaridade;


    public UnidadeEscolar convertToObject() {
        return new UnidadeEscolar(nome, numVagas, data, endereco, anoEscolaridade);
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

    public Set<AnoEscolaridade> getAnoEscolaridade() {
        return anoEscolaridade;
    }

    public void setAnoEscolaridade(Set<AnoEscolaridade> anoEscolaridade) {
        this.anoEscolaridade = anoEscolaridade;
    }
}
