package br.com.guiVitoriano.application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import br.com.guiVitoriano.application.model.Despesas;

@SuppressWarnings("serial")
@Named("tabela")
@SessionScoped
public class TabelaBean implements Serializable{
	
	private List<Despesas> despesas = new ArrayList<>();

	
	public String inserir() {
		
		//Instância da listaDataModel
		Despesas d = new Despesas();
		d.setEdit(true);
		despesas.add(d);
		return null;
	}
	
	public String excluir(Despesas despesa) {
		
		despesas.remove(despesa);
		
		return null;
	}
	
	public String editar(Despesas despesa) {
		despesa.setEdit(true); 
		
		return null;
	}
	
	public String gravar (Despesas despesa) {
		despesa.setEdit(false);
		
		return null;
	}
	
	public List <Despesas> getDespesas() {
		return despesas;
	}

}
