package model;

import com.j256.ormlite.field.DatabaseField;

public class Perm {
	
	public static final String NUM_PERM_FIELD_NAME = "num_perm";
	public static final String NOME_PERM_FIELD_NAME = "nome_perm";
	
	@DatabaseField (generatedId = true)
	private int id;
	
	@DatabaseField (columnName = NUM_PERM_FIELD_NAME)
	private String num_perm;
	
	@DatabaseField (columnName = NOME_PERM_FIELD_NAME)
	private String nome_perm;
	
	
	
	
	public int getId() {
		return id;
	}
	public String getNum_perm() {
		return num_perm;
	}

	public void setNum_perm(String num_perm) {
		this.num_perm = num_perm;
	}

	public String getNome_perm() {
		return nome_perm;
	}

	public void setNome_perm(String nome_perm) {
		this.nome_perm = nome_perm;
	}

	
	

	public Perm(String num_perm, String nome_perm, int id) {
		super();
		this.id = id;
		this.num_perm = num_perm;
		this.nome_perm = nome_perm;
	}
	
	public Perm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Perm [id=" + id + ", num_perm, nome_perm=" + nome_perm + ", getNum_perm()=" + getNum_perm()
				+ ", getNome_perm()=" + getNome_perm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
