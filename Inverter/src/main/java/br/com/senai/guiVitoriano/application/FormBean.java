package br.com.senai.guiVitoriano.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class FormBean implements Serializable {

	private String texto;
	private String textoInvertido;
	
	public String inverter() {
		// Responsável pela inversão do texto inserido
		textoInvertido = new StringBuilder(texto).reverse().toString();
		return null;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTextoInvertido() {
		return textoInvertido;
	}

	public void setTextoInvertido(String textoInvertido) {
		this.textoInvertido = textoInvertido;
	}
}