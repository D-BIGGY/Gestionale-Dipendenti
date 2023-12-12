package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "entrate")
public class Entrate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Date dataEntrata;
	
	@Column
	private int idUtenteEntrata;

	public Entrate(Long id, Date data, int idUtente) {
		super();
		this.id = id;
		this.dataEntrata = data;
		this.idUtenteEntrata = idUtente;
	}

	public Entrate() {
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
	 * @return the data
	 */
	public Date getDataEntrata() {
		return dataEntrata;
	}

	/**
	 * @param data the data to set
	 */
	public void setDataEntrata(Date data) {
		this.dataEntrata = data;
	}

	/**
	 * @return the idUtente
	 */
	public int getIdUtenteEntrata() {
		return idUtenteEntrata;
	}

	/**
	 * @param idUtente the idUtente to set
	 */
	public void setIdUtenteEntrata(int idUtente) {
		this.idUtenteEntrata = idUtente;
	}
	
	
	

}