package com.rest.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.investigadores.dto.Investigador;

public interface IInvestigadorDAO extends JpaRepository<Investigador, String> {

}