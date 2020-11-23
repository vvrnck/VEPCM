package com.uff.br.DTO;

import com.uff.br.entities.*;


public class ListaEsperaRespostaDTO {
    private int id;
    private String data;
    private Aluno aluno;

    private ListaEsperaRespostaDTO(int id, String data, Aluno aluno){
        this.id = id;
        this.data = data;
        this.aluno = aluno;
    }

    public static ListaEsperaRespostaDTO convertToDTO(ListaEspera le) {
        return new ListaEsperaRespostaDTO(le.getId(), le.getData(), le.getIdAluno());
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

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
