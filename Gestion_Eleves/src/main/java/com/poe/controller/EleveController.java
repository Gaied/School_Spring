package com.poe.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poe.model.Eleve;

public interface EleveController extends JpaRepository<Eleve, Integer> {

}
