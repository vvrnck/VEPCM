package com.uff.br.DTO;



import com.uff.br.entities.Gestor;
import com.uff.br.entities.Pessoa;


public class GestorDTO {
    private int id;
    private String matricula;
    private Pessoa idPessoa;


    public Gestor convertToObject() {
        return new Gestor (id, matricula, idPessoa);
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
