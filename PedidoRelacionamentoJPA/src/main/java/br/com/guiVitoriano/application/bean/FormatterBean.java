package br.com.guiVitoriano.application.bean;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped

public class FormatterBean implements Serializable {


	private static final Locale LOCALE_BR = new Locale("pt", "BR");
	
	//Realiza a conversão para double
	public String formatarMoeda(double valor) {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALE_BR);
		//Seleciona o valor a ser formatado
		return nf.format(valor);
	}
}