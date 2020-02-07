package model;

public abstract class Usuario {
	
	private String login;
	private String senha;
	private int tipo;
	/**
	 * @return the login
	 */
	public String getLogin () {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin (String login) {
		this.login = login;
	}
	/**
	 * @return the senha
	 */
	public String getSenha () {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha (String senha) {
		this.senha = senha;
	}
	/**
	 * @return the tipo
	 */
	public int getTipo () {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo (int tipo) {
		this.tipo = tipo;
	}
	
	public Usuario () {
		//TODO Auto-generated constructor stub
		super ();
	}
	
	public Usuario (String login, String senha, int tipo) {
		super ();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	public abstract void mostrar ();
}
