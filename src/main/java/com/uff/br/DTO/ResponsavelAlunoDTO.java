package com.uff.br.DTO;




import com.uff.br.entities.Aluno;
import com.uff.br.entities.Responsavel;
import com.uff.br.entities.ResponsavelAluno;

import java.util.Set;

public class ResponsavelAlunoDTO {
    private Responsavel idResponsavel;
    private Aluno idAluno;


    public ResponsavelAluno convertToObject() {
        return new ResponsavelAluno(idResponsavel, idAluno);
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
