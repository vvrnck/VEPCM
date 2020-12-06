package com.uff.br.DTO;

import com.uff.br.entities.Aluno;
import com.uff.br.entities.Responsavel;
import com.uff.br.entities.ResponsavelAluno;

public class ResponsavelAlunoRespostaDTO {

    private int id;
    private Responsavel idResponsavel;
    private Aluno idAluno;



    public ResponsavelAlunoRespostaDTO(int id, Responsavel idResponsavel, Aluno idAluno) {
        this.id = id;
        this.idResponsavel = idResponsavel;
        this.idAluno = idAluno;
    }

    public static ResponsavelAlunoRespostaDTO convertToDTO(ResponsavelAluno responsavelAluno) {
        return new ResponsavelAlunoRespostaDTO(responsavelAluno.getId(), responsavelAluno.getIdResponsavel(), responsavelAluno.getIdAluno());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Responsavel getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Responsavel idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public Aluno getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Aluno idAluno) {
        this.idAluno = idAluno;
    }
}