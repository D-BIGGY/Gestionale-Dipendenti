package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "dipendente")
public class Dipendente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	@NotNull
	private String matricola;
	@Column
	@NotNull
	private String nome;
	@Column
	@NotNull
	private String cognome;
	@Column
	@NotNull
	private String username;
	@Column
	@NotNull
	private String password;
	@Column
	@NotNull
	@Email
	private String email;
	@Column
	@NotNull
	private Boolean ruolo;

	public Dipendente(Long id, @NotNull String matricola, @NotNull String nome, @NotNull String cognome,
			@NotNull String username, @NotNull String password, @NotNull @Email String email, @NotNull Boolean ruolo) {
		super();
		this.id = id;
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.email = email;
		this.ruolo = ruolo;
	}

	public Dipendente() {
		super();
	}

	public Boolean getRuolo() {
		return ruolo;
	}

	public void setRuolo(Boolean ruolo) {
		this.ruolo = ruolo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
