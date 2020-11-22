package com.uff.br.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "naturalidade")
    private String naturalidade;

    @Column(name = "nomeMae")
    private String nomeMae;

    @Column(name = "nomePai")
    private String nomePai;


//    private Pessoa pessoa;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "responsavel", referencedColumnName = "id")
//    private Responsavel responsavel;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
//    private Collection<ListaEspera> listaEsperaCollection;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
//    private Collection<Solicitacao> solicitacaoCollection;
//


    public Aluno() {}
}
