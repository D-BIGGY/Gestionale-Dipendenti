package com.example.demo.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "uscite")
public class Uscite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Date dataUscita;
	
	@Column
	private int idUtenteUscita;
	
	

	public Uscite(Long id, Date dataUscita, int idUtenteUscita) {
		super();
		this.id = id;
		this.dataUscita = dataUscita;
		this.idUtenteUscita = idUtenteUscita;
	}
	
	public Uscite() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the dataUscita
	 */
	public Date getDataUscita() {
		return dataUscita;
	}

	/**
	 * @param dataUscita the dataUscita to set
	 */
	public void setDataUscita(Date dataUscita) {
		this.dataUscita = dataUscita;
	}

	/**
	 * @return the idUtenteUscita
	 */
	public int getIdUtenteUscita() {
		return idUtenteUscita;
	}

	/**
	 * @param idUtenteUscita the idUtenteUscita to set
	 */
	public void setIdUtenteUscita(int idUtenteUscita) {
		this.idUtenteUscita = idUtenteUscita;
	}
	
	
	

}
