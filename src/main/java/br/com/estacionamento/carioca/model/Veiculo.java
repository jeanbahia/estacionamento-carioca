package br.com.estacionamento.carioca.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.estacionamento.carioca.enums.TipoVeiculoEnum;

@Entity
public class Veiculo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	private String placa;

	private String modelo;

	private String cor;

	private TipoVeiculoEnum tipo;

	public Long getId() {
		return id;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public TipoVeiculoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeiculoEnum tipo) {
		this.tipo = tipo;
	}
}
