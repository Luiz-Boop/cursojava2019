package controller;

public class ExemploVetorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pa�ses [] = new String [10];
		for (int i = 0; i < pa�ses.length; i++) {
			pa�ses [i] = new String ("Brasil");
		
		}	
		pa�ses [0] = "Jap�o";
		pa�ses [2] = "It�lia";
		pa�ses [3] = "Argentina";
		pa�ses [8] = "Peru";
		
		pa�ses [4] = "Japinha";
		pa�ses [7] = "Italiana";
		pa�ses [9] = "Argent-ina";
		pa�ses [1] = "Peru..hum...";
		
		for (int i = 0; i < pa�ses.length; i++) {
			System.out.println ("paises [ " + i +" ] = " + pa�ses [i]);
		}
			
		
	}

}
