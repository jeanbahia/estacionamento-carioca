package br.com.estacionamento.carioca.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.estacionamento.carioca.enums.EstadoVagaEnum;

@Entity
public class Vaga implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true)
	private String numero;

	private String andar;

	private EstadoVagaEnum estado;
	
	public Vaga() {
		this.estado = EstadoVagaEnum.NAO_OCUPADA;
	}

	public Long getId() {
		return id;
	}

	public String getNumero() {
		return numero;
	}

	public String getAndar() {
		return andar;
	}

	public EstadoVagaEnum getEstado() {
		return estado;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public void setEstado(EstadoVagaEnum estado) {
		this.estado = estado;
	}

}
