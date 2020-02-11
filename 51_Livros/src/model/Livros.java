package model;

import com.j256.ormlite.field.DatabaseField;

public class Livros {
	// for QueryBuilder to be to find the fields
	public static final String ISBN_FIELD_NAME = "isbn";
	public static final String TITULO_FIELD_NAME = "titulo";
	private static final String EDICAO_FIELD_NAME = "edicao";
	private static final String ANO_FIELD_NAME = "ano";
	private static final String FORMATO_FIELD_NAME = "formato";
	private static final String PAGINAS_FIELD_NAME = "paginas";
	private static final String EDITORA_FIELD_NAME = "editora";
	private static final String AUTOR_FIELD_NAME = "autor";
	
	@DatabaseField (generatedId = true)
	private int id;
	
	@DatabaseField (columnName = ISBN_FIELD_NAME, canBeNull = false)
	private long isbn;
	
	@DatabaseField (columnName = TITULO_FIELD_NAME)
	private String titulo;
	
	
	
	@DatabaseField (columnName = EDICAO_FIELD_NAME)
	private int edicao;
	
	@DatabaseField (columnName = ANO_FIELD_NAME)
	private int ano;
	
	@DatabaseField (columnName = FORMATO_FIELD_NAME)
	private String formato;
	
	@DatabaseField (columnName = PAGINAS_FIELD_NAME)
	private int paginas;
	
	@DatabaseField (columnName = EDITORA_FIELD_NAME)
	private String editora;
	
	@DatabaseField (columnName = AUTOR_FIELD_NAME)
	private String autor;
	
	
	//Exemplo //int isbn = 9786590053817;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public static String getIsbnFieldName() {
		return ISBN_FIELD_NAME;
	}
	public static String getTituloFieldName() {
		return TITULO_FIELD_NAME;
	}
	public Livros() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livros(int id, long isbn, String titulo, int edicao, int ano, String formato, int paginas, String editora,
			String autor) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicao = edicao;
		this.ano = ano;
		this.formato = formato;
		this.paginas = paginas;
		this.editora = editora;
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Livros [id=" + id + ", isbn=" + isbn + ", titulo=" + titulo + ", edicao=" + edicao + ", ano=" + ano
				+ ", formato=" + formato + ", paginas=" + paginas + ", editora=" + editora + ", autor=" + autor
				+ ", getId()=" + getId() + ", getIsbn()=" + getIsbn() + ", getTitulo()=" + getTitulo()
				+ ", getEdicao()=" + getEdicao() + ", getAno()=" + getAno() + ", getFormato()=" + getFormato()
				+ ", getPaginas()=" + getPaginas() + ", getEditora()=" + getEditora() + ", getAutor()=" + getAutor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
	
	