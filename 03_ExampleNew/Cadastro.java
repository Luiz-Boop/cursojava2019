package controller;
import model.Usuario;
public class Cadastro {
	public static void main(String[] args) {
		Usuario user = new Usuario () ;
		user.nome="joão da Silva Sauro";
		user.endereco="Rua sem Fim,72";
		user.idade=46;
	System.out.println(user.nome);
		System.out.println(user.endereco);
		System.out.println(user.idade);
		// TODO Auto-generated method stub
	}

}