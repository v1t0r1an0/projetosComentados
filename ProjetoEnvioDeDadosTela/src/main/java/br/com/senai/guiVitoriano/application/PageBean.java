package br.com.senai.rayssalima.application;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class PageBean implements Serializable {
	private String nome;
	
	@Inject//injeta o c�digo flash
	private Flash flash;
	
	public String processar() {
		//A vari�vel inserida � armazenada pelo flah
		flash.put("nomeDoUsuario", nome);
		
		return "result?faces-redirect=true";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}