package br.com.senai.guiVitoriano.jpa.jsfbean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.senai.guiVitoriano.jpa.ejbbean.TarefaBean;
import br.com.senai.guiVitoriano.jpa.model.Tarefa;

@SuppressWarnings("serial")
@Named("form")
@RequestScoped
public class FormBean implements Serializable {
	
	@EJB
	//Framework de Lógica de Negócio
	private TarefaBean tarefaBean;
	//@Inject --> injeta o código
	@Inject
	private FacesContext context;
	
	//UIComponent --> Componente de busca
	private UIComponent searchInputText;
	
	private Integer tarefaId;
	
	private Tarefa tarefa;
	
	//Chama os métodos presentes no TarefaBean
	public void gravar(AjaxBehaviorEvent event) {
		if(tarefa.getId()==null) {
			tarefaBean.inserir(tarefa);
		}else {
			tarefaBean.atualizar(tarefa);
		}		
	}
	
	public void pesquisar(AjaxBehaviorEvent event) {
		tarefa = tarefaBean.carregar(tarefaId);
		
		if(tarefa == null) {
			//Realiza a buca do ID da tarefa
			context.addMessage(searchInputText.getClientId(context),
					new FacesMessage("Tarefa não encontrada"));
		}
		tarefaId = null;		
	}
	
	public void excluir(AjaxBehaviorEvent event) {
		tarefaBean.excluir(tarefa);
		tarefa = null;
	}
	public Tarefa getTarefa() {
		if(tarefa==null) {
			tarefa = new Tarefa();
		}
		return tarefa;
	}

	public UIComponent getSearchInputText() {
		return searchInputText;
	}

	public void setSearchInputText(UIComponent searchInputText) {
		this.searchInputText = searchInputText;
	}

	public Integer getTarefaId() {
		return tarefaId;
	}

	public void setTarefaId(Integer tarefaId) {
		this.tarefaId = tarefaId;
	}
	
	
	
}