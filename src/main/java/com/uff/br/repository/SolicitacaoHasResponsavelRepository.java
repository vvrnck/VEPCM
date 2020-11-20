package com.uff.br.repository;


import com.uff.br.entities.Pessoa;
import com.uff.br.entities.SolicitacaoHasResponsavel;
import com.uff.br.entities.SolicitacaoHasResponsavelPK;
import org.springframework.data.repository.CrudRepository;

public interface SolicitacaoHasResponsavelRepository extends CrudRepository<SolicitacaoHasResponsavel, Integer> {

}