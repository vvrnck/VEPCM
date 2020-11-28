package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Set;

@Entity
public class ListaEspera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "data")
    private String data;


    @JoinColumn(name = "aluno", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Aluno aluno;

    public ListaEspera() {
    }

    public ListaEspera(String data, Aluno aluno) {
        this.data = data;
        this.aluno = aluno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Aluno getIdAluno() {
        return aluno;
    }

    public void setIdAluno(Aluno idAluno) {
        this.aluno = idAluno;
    }
}
