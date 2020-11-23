/*
package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Iterator;
import java.util.Set;

@Entity
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "protocolo")
    private String protocolo;

    @JoinColumn(name = "idAluno", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Aluno idAluno;

    @JoinColumn(name = "idPessoa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pessoa idPessoa;

    @JoinColumns({
            @JoinColumn(name = "idUnidadeEscolar", referencedColumnName = "id")
            , @JoinColumn(name = "idAnoEscolaridade", referencedColumnName = "id")})
    @ManyToOne(optional = false)
    private  unidadeEscolarHasAnoEscolaridade;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitacao")
    private Collection<SolicitacaoHasResponsavel> solicitacaoHasResponsavelCollection;

*/
