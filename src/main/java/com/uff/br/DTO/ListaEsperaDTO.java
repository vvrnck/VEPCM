package com.uff.br.DTO;


import com.uff.br.entities.Aluno;
import com.uff.br.entities.ListaEspera;
import com.uff.br.entities.Pessoa;

import java.util.Set;


public class ListaEsperaDTO {
    private String data;
    private Aluno aluno;

    public ListaEspera convertToObject() {
        return new ListaEspera (data, aluno);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
