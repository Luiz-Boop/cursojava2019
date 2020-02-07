package model;

public class Aluno extends Usuario implements IUsuario {
	
	@Override
	public boolean validarLogin (String login, String senha) {
		if (getLogin () .equals (login) && getSenha () .equals (senha)) {
			return true;
		}
		return false;
	}
		private String nome;
		private String turno;
		private String turma;
		private int matr�culaAluno;
		
		
		
		public String getNome() {
			return nome;
		}



		public void setNome(String nome) {
			this.nome = nome;
		}



		public String getTurno() {
			return turno;
		}



		public void setTurno(String turno) {
			this.turno = turno;
		}



		public String getTumra() {
			return turma;
		}



		public void setTumra(String tumra) {
			this.turma = tumra;
		}



		public int getMatr�culaAluno() {
			return matr�culaAluno;
		}



		public void setMatr�culaAluno(int matr�culaAluno) {
			this.matr�culaAluno = matr�culaAluno;
		}



		public Aluno() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Aluno(String login, String senha, int tipo) {
			super(login, senha, tipo);
			// TODO Auto-generated constructor stub
		}



		public Aluno(String login, String senha, int tipo, String nome, String turno, String turma, int matr�culaAluno) {
			super(login, senha, tipo);
			this.nome = nome;
			this.turno = turno;
			this.turma = turma;
			this.matr�culaAluno = matr�culaAluno;
		}



		@Override
		public void mostrar () {	
		System.out.println ("Informa��es do aluno: ");
		System.out.println ("Login: " + super.getLogin ());
		System.out.println ("Senha: ******");
		
		System.out.println ("Matr�cula: " + matr�culaAluno);
		System.out.println ("Nome: " + nome);
		System.out.println ("Turno: " + turno);
		System.out.println ("Turma: " + turma);
	}

}
