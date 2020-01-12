package com.poe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poe.dao.EleveDao;
import com.poe.model.Eleve;

@RestController
public class EleveService {

	@Autowired
	private EleveDao eleveDao;

	@RequestMapping(value = "/eleve", method = RequestMethod.POST)
	@ResponseBody
	public Eleve saveEleve(@RequestBody Eleve e) {
		return eleveDao.saveEleve(e);
	}

	@RequestMapping(value = "/eleves", method = RequestMethod.GET)
	public List<Eleve> ListEleve() {
		return eleveDao.ListEleve();
	}

}
