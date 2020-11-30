package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import java.util.Set;
@Entity
public class Gestor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "matricula")
    private String matricula;

    @JsonBackReference (value = "gestor-pessoa")
    @JoinColumn(name = "idPessoa", referencedColumnName = "id")
    @ManyToOne (cascade = CascadeType.ALL) /*(optional = false)*/
    private Pessoa idPessoa;


    public Gestor() {}


    public Gestor(int id, String matricula, Pessoa idPessoa) {
        this.id = id;
        this.matricula = matricula;
        this.idPessoa = idPessoa;
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
