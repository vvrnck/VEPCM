/*
package com.uff.br.entities;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class ListaEspera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "data")
    private String data;

    @JoinColumn(name = "idAluno", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Aluno idAluno;

    public ListaEspera() {
    }

    public ListaEspera(Integer id) {
        this.id = id;
    }

    public ListaEspera(Integer id, Date data) {
        this.id = id;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aluno getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Aluno alunoId) {
        this.alunoId = alunoId;
    }
}
*/
