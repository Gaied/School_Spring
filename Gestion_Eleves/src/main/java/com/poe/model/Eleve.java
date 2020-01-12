package com.poe.model;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "t_eleve")
public class Eleve {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name= "nom", length= 100 , nullable=false)
	private String lastname;
	@Column(name= "prenom", length= 100)
	private String firstname;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_naissance")
	private Date date_naissance;
	@Column(name="adresse", length= 250)
	private String adresse;
//	@Enumerated(EnumType.STRING)
//	private Sexe sexe;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="classe", nullable=false)
	private Classe classe;
	
	@OneToMany(mappedBy="eleve", fetch = FetchType.LAZY)
	private List<Note> Listnote;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	@Override
	public String toString() {
		return "Eleve [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", date_naissance="
				+ date_naissance + ", adresse=" + adresse + "]";
	}	
	
	

}
