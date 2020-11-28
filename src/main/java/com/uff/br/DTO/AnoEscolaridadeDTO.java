package com.uff.br.DTO;


import com.uff.br.entities.AnoEscolaridade;
import com.uff.br.entities.UnidadeEscolar;
//import com.uff.br.entities.UnidadeEscolarAnoEscolaridade;

import java.util.Set;

public class AnoEscolaridadeDTO {
    private String nome;
    private String descricao;
    private Set<UnidadeEscolar> unidadeEscolar;

    public AnoEscolaridade convertToObject() {
        return new AnoEscolaridade(nome, descricao, unidadeEscolar);
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<UnidadeEscolar> getUnidadeEscolar() {
        return unidadeEscolar;
    }

    public void setUnidadeEscolar(Set<UnidadeEscolar> unidadeEscolar) {
        this.unidadeEscolar = unidadeEscolar;
    }
}
