package com.poe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_matiere")
public class Matiere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idmatiere;
	@Column(name= "nom", length= 250 , nullable=false)
	private String name;
	
//	@OneToMany(mappedBy="matiere", fetch = FetchType.LAZY)
//	private List<Note> Listnote;

}
