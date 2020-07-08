package com.silvio.eventoapp.repository

import com.silvio.eventoapp.model.Evento;

import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, String> {

}