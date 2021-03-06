package br.com.senai.guiVitoriano.application.model;

public class Linguagem {
	
	//Variáveis sendo instânciadas
	private Integer id;
	private String nome;
	
	//Vetor de constantes sendo instânciado
	public static final Linguagem [] LINGUAGENS;
	
	//As constantes do vetor acima
	static {
		LINGUAGENS = new Linguagem[5];
		LINGUAGENS[0] = new Linguagem(1, "Java");
		LINGUAGENS[1] = new Linguagem(2, "IOS");
		LINGUAGENS[2] = new Linguagem(3, "C++");
		LINGUAGENS[3] = new Linguagem(4, "C#");
		LINGUAGENS[4] = new Linguagem(5, "PHP");
	}
	
	public Linguagem(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

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
}
