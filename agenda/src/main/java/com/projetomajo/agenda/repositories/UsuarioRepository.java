package com.projetomajo.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetomajo.agenda.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
