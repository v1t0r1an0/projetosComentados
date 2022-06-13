package br.com.guiVitoriano.application;

public class Telefone {
	/*
	 * Enums representam um conjunto fixo de valores,
	 * nesse caso, o DDD e o número do telefone,
	 * de uma forma mais ou menos autodocumentada.
	 * Tornam o código mais explícito, mais legível,
	 * e menos vulnerável a erros de programação.
	 */
	enum Tipotelefone {
		FIXO, CELULAR;
	}

	private String ddd;
	private String numero;
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}