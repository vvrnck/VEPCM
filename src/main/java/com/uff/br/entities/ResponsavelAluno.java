package com.uff.br.entities;

import javax.persistence.*;

import java.util.Set;

@Entity
public class ResponsavelAluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "idResponsavel", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Responsavel idResponsavel;

    @JoinColumn(name = "idAluno", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Aluno idAluno;

    public ResponsavelAluno() {
    }

    public ResponsavelAluno(Responsavel idResponsavel, Aluno idAluno) {
        this.idResponsavel = idResponsavel;
        this.idAluno = idAluno;

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