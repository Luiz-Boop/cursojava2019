package controller;

public class ExemploMetdoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "http://www.senai.rj.br/ctti/turma2010011";
		String email = "aluno@senai.br";
		
		String dominio;
		dominio = url.substring (7,22);
		System.out.println ("Domínio: " + dominio);
		
		String complemento;
		complemento = url.substring (23);
		System.out.println ("complemento do dominio" + complemento);
		
		String nomeUsuario;
		nomeUsuario = email.substring (0, email.indexOf ('@'));
		System.out.println ("Usuário e-mail: " + nomeUsuario);
		
		String maiuscula, minuscula, palavra1, palavra2;
		palavra1 = "carro";
		palavra2 = "CASA";
		maiuscula = palavra1.toUpperCase ();
		System.out.println ("maiuscula: " + maiuscula);
		minuscula = palavra2.toLowerCase ();
		System.out.println ("minuscula: " + minuscula);

	}

}
