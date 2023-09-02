package com.rest.cientificos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.cientificos.dto.Cientifico;

public interface ICientificoDAO extends JpaRepository<Cientifico, String> {

}