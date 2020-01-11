package controller;

public class ExemploVetorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String países [] = new String [10];
		for (int i = 0; i < países.length; i++) {
			países [i] = new String ("Brasil");
		
		}	
		países [0] = "Japão";
		países [2] = "Itália";
		países [3] = "Argentina";
		países [8] = "Peru";
		
		países [4] = "Japinha";
		países [7] = "Italiana";
		países [9] = "Argent-ina";
		países [1] = "Peru..hum...";
		
		for (int i = 0; i < países.length; i++) {
			System.out.println ("paises [ " + i +" ] = " + países [i]);
		}
			
		
	}

}
