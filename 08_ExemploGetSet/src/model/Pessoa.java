package model;

public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	private String profissao;
	private String cor;
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSexo () {
		return sexo;
	}
	
	public void setSexo (String sexo) {
		this.sexo = sexo;
	}
	
	public int getIdade () {
		return idade;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public void setProfissao (String profissao) {
		this.profissao = profissao;
	}
	
	
	public String getProfissao () {
		return profissao;
	}
	
	public void setCor (String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
}