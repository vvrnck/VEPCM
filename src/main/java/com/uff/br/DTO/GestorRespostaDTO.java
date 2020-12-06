package com.uff.br.DTO;

import com.uff.br.entities.Aluno;
import com.uff.br.entities.Gestor;
import com.uff.br.entities.Pessoa;

public class GestorRespostaDTO {

    private int id;
    private String matricula;
    private Pessoa idPessoa;



    public GestorRespostaDTO(int id, String matricula, Pessoa idPessoa) {
        this.id = id;
        this.matricula = matricula;
        this.idPessoa = idPessoa;
    }

    public static GestorRespostaDTO convertToDTO(Gestor gestor) {
        return new GestorRespostaDTO(gestor.getId(), gestor.getMatricula(), gestor.getIdPessoa());
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Pessoa getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }
}
