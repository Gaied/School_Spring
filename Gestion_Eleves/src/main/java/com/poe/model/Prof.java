package com.poe.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_prof")
public class Prof {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="nom", length=100, nullable=false)
	private String lastname;
	@Column(name= "prenom", length= 100)
	private String firstname;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_naissance")
	private Date date_naissance;
	@Column(name="adresse", length= 250)
	private String adresse;
	
	@OneToMany(mappedBy = "prof", fetch = FetchType.LAZY)
	private List<Classe> ListClasse;
	
	@OneToMany(mappedBy="prof", fetch = FetchType.LAZY)
	private List<Note> Listnote;
	

}
