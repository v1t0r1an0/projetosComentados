package br.com.senai.guiVitoriano.application;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("loginb") 
@RequestScoped
public class LoginBean implements Serializable{

	private String nome;
	private String senha;
	
	@PostConstruct
	public void onCreate() {
		System.out.println("Bean criado");
	}
	
	//Indica a msg a ser exibida antes do bean ser destru�do
	@PreDestroy
	public void onDestroy () {
		System.out.println("Bean ser� destru�do");
	}
	
	/*
	 * Valores padronizados para login e senha, caso n�o
	 * ocorra a valida��o, o retorno � vazio
	 */
	
	public String doLogin() {
		if ("abc".equals(nome) && "123".equals(senha)) {
			return "sucesso";
		}

		return null;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}