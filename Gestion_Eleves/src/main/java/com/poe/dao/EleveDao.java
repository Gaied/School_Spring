package com.poe.dao;

import java.util.List;

import com.poe.model.Eleve;

public interface EleveDao {

	public Eleve saveEleve(Eleve e);

	public List<Eleve> ListEleve();

}
