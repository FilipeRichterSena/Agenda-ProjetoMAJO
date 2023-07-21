package com.projetomajo.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetomajo.agenda.entities.Agendamentos;
import com.projetomajo.agenda.repositories.AgendamentosRepository;

@RestController
@RequestMapping(value = "/agendamentos")
public class AgendamentosController {

	@Autowired
	private AgendamentosRepository repository;
	
	@GetMapping
	public List<Agendamentos> findAll() {
		List<Agendamentos> result = repository.findAll();
		return result;
	}
}
