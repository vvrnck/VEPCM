package com.uff.br.repository;

import com.uff.br.entities.Pessoa;
import com.uff.br.entities.TipoFuncionario;
import org.springframework.data.repository.CrudRepository;

public interface TipoFuncionarioRepository extends CrudRepository<TipoFuncionario, Integer> {

}