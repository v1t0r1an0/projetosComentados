package br.com.senai.guiVitoriano.application.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

@FacesConfig(version = Version.JSF_2_3) //Diz ao Eclipse qual versão ele deve utilizar 
@ApplicationScoped //Dura apenas durante o funcionamento da aplicação
public class Config {
	
}