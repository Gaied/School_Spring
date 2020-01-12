package com.poe.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poe.controller.EleveController;
import com.poe.dao.EleveDao;
import com.poe.model.Eleve;

@Service
public class EleveDaoImp implements EleveDao {
	
	@Autowired
	private EleveController eleveC;

	@Override
	public Eleve saveEleve(Eleve e) {
		// TODO Auto-generated method stub
		return eleveC.save(e);
	}

	@Override
	public List<Eleve> ListEleve() {
		// TODO Auto-generated method stub
		return eleveC.findAll();
	}

}
