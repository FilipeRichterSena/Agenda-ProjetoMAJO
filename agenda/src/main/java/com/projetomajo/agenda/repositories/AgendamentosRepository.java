package com.projetomajo.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetomajo.agenda.entities.Agendamentos;

public interface AgendamentosRepository extends JpaRepository<Agendamentos, Long>{

}
