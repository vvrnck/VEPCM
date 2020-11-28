package com.uff.br.repository;

import com.uff.br.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    @Query("SELECT u FROM Usuario u WHERE LOWER(u.email) = LOWER(:email) AND u.senha = :senha")
    public Usuario getAuth(String email, String senha);

}
