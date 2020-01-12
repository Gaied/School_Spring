package com.poe.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "t_classe")
public class Classe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nom", length = 100, nullable = false)
	private String name;
	@OneToMany(mappedBy = "classe", fetch = FetchType.LAZY)
	private List<Eleve> Listeleves;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="prof", nullable=false)
	private Prof prof;
	
	@OneToMany(mappedBy="classe", fetch = FetchType.LAZY)
	private List<Note> Listnote;

	@Override
	public String toString() {
		return "Classe [id=" + id + ", name=" + name + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Eleve> getListeleves() {
		return Listeleves;
	}

	public void setListeleves(List<Eleve> listeleves) {
		Listeleves = listeleves;
	}


}
