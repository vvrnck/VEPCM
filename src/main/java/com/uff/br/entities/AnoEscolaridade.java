package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AnoEscolaridade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;




    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "anoEscolaridade")
    private Set<UnidadeEscolar> unidadeEscolar;


    /*@JsonIgnore
    @JsonBackReference(value = "anoEscolaridade-unidadeEscolarAnoEscolaridade")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "anoEscolaridade")
    private Set<UnidadeEscolarAnoEscolaridade> unidadeEscolarAnoEscolaridade;
*/
    public AnoEscolaridade() {}

    public AnoEscolaridade(String nome, String descricao, Set<UnidadeEscolar> unidadeEscolar) {
        this.nome = nome;
        this.descricao = descricao;
        this.unidadeEscolar = unidadeEscolar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<UnidadeEscolar> getUnidadeEscolar() {
        return unidadeEscolar;
    }

    public void setUnidadeEscolar(Set<UnidadeEscolar> unidadeEscolar) {
        this.unidadeEscolar = unidadeEscolar;
    }
}
