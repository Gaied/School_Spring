package com.poe.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_notes")
public class Note {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idnotes;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_saisie")
	private Date date;
	@Column(name= "nom", length= 11 , nullable=false)
	private Integer note;
	@Column(name= "avis", nullable=false)
	private String avis;
	@Column(name= "avencement", nullable=false)
	private float avencement;
	
	@ManyToOne
	@JoinColumn(name="idprof", nullable=false)
	private Prof prof;
	
	@ManyToOne
	@JoinColumn(name="ideleve", nullable=false)
	private Eleve eleve;
	
	@ManyToOne
	@JoinColumn(name="idclasse", nullable=false)
	private Classe classe;
	
	@ManyToOne
	@JoinColumn(name="idmatiere", nullable=false)
	private Matiere matire;
	
	@ManyToOne
	@JoinColumn(name="idtrimestre", nullable=false)
	private Trimestre trimestre;

}
