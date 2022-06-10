package br.com.senai.guiVitoriano.application.javaee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class NumberBean implements Serializable {
	
	//Inst�ncia dos m�todos dos n�meros aleat�rios
	private static Random random = new Random();

	private Integer qtde;
	private Integer min;
	private Integer max;
	
	private List<Integer> numeros = new ArrayList<>();

	/*
	 * De acordo com a defini��o dos n�meros
	 * valores m�nimos e m�ximos iram ser gerados
	 * os n�meros aleat�rios dentro desses par�metros
	 * */
	public String gerar() {
		for (int i = 0; i < qtde; i++) {
			int n = random.nextInt(max - min) + min + 1;
			numeros.add(n);
		}
		
		return null;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
}