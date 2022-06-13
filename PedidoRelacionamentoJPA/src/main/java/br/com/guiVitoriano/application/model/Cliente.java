package br.com.guiVitoriano.application.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity //Cria a tabela cliente
public class Cliente implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer id;
	//nullable - analisa se o campo pode ser vazio ou não
	//length - Determina o numero máximo de caracteres
	//OneToMany - Determina o tipo de cardinalidade entre as tabelas
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 50, nullable = false)
	private String email;

	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	//Sobrescreve o método
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
}