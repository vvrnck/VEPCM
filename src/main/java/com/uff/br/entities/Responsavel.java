/*
package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import java.util.Set;

@Entity
public class Responsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResponsavel")
    private Set<Aluno> aluno;
*/
/*

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResponsavel")
    private Set<Solicitacao> solicitacao;

*//*


*/
/*
@OneToMany(cascade = CascadeType.ALL, mappedBy = "responsavel")
    private Collection<SolicitacaoHasResponsavel> solicitacaoHasResponsavelCollection;
*//*

*/
/*

    @JoinColumn(name = "idPessoa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pessoa idPessoa;
*//*




    public Responsavel() {}
*/
/*

    public Responsavel(Set<Aluno> aluno
, Set<Solicitacao> solicitacao
) {
        this.aluno = aluno;
 this.solicitacao = solicitacao;

    }
*//*


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(Set<Aluno> aluno) {
        this.aluno = aluno;
    }
*/
/*
public Set<Solicitacao> getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Set<Solicitacao> solicitacao) {
        this.solicitacao = solicitacao;
    }*//*


}
*/
