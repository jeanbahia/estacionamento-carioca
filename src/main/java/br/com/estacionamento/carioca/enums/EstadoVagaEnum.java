package br.com.estacionamento.carioca.enums;

public enum EstadoVagaEnum {
	
	OCUPADA(1, "Ocupada"), 
	NAO_OCUPADA(2, "Não ocupada");

	private Integer codigo;

	private String decricao;

	private EstadoVagaEnum(Integer codigo, String decricao) {
		this.codigo = codigo;
		this.decricao = decricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDecricao() {
		return decricao;
	}

	public EstadoVagaEnum obterPor(Integer codigo) {

		for (EstadoVagaEnum estado : EstadoVagaEnum.values()) {
			if (codigo.equals(estado.getCodigo())) {
				return estado;
			}
		}

		throw new IllegalStateException("Estado inválido");
	}

}
