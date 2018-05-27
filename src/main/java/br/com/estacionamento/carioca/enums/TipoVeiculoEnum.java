package br.com.estacionamento.carioca.enums;

public enum TipoVeiculoEnum {

	CARGA(1, "Carga"), 
	PASSEIO(2, "Passeio");

	private Integer codigo;

	private String decricao;

	private TipoVeiculoEnum(Integer codigo, String decricao) {
		this.codigo = codigo;
		this.decricao = decricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDecricao() {
		return decricao;
	}

	public TipoVeiculoEnum obterPor(Integer codigo) {

		for (TipoVeiculoEnum tipoVeiculo : TipoVeiculoEnum.values()) {
			if (codigo.equals(tipoVeiculo.getCodigo())) {
				return tipoVeiculo;
			}
		}

		throw new IllegalStateException("Tipo de veículo inválido");
	}
}
