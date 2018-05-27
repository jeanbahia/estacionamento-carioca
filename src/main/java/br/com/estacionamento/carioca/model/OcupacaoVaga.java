package br.com.estacionamento.carioca.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class OcupacaoVaga implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date inicio;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fim;

	private BigDecimal valor;

	@ManyToOne
	@JoinColumn(name = "cd_veiculo")
	private Veiculo veiculo;

	@ManyToOne
	@JoinColumn(name = "cd_vaga")
	private Vaga vaga;

	public Long getId() {
		return id;
	}

	public Date getInicio() {
		return inicio;
	}

	public Date getFim() {
		return fim;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
}
