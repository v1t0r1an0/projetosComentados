package br.com.senai.guiVitoriano.application.javaee;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

@FacesConfig(version = Version.JSF_2_3) //Diz ao Eclipse qual vers�o ele deve utilizar 
@ApplicationScoped //Dura apenas durante o funcionamento da aplica��o
public class Config {
	
}