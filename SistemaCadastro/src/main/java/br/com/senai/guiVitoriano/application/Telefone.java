package br.com.senai.guiVitoriano.application;

public class Telefone {
	/*
	 * Enums representam um conjunto fixo de valores,
	 * nesse caso, o DDD e o n�mero do telefone,
	 * de uma forma mais ou menos autodocumentada.
	 * Tornam o c�digo mais expl�cito, mais leg�vel,
	 * e menos vulner�vel a erros de programa��o.
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