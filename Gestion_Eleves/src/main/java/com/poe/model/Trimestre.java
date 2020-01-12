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
@Table(name="t_trimestre")
public class Trimestre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idtrimestre;
	@Column(name= "nom", length= 11)
	private Integer name;
	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	private Date date;
	
	@OneToMany(mappedBy="trimestre", fetch = FetchType.LAZY)
	private List<Note> Listnote;

}
