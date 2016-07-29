package br.com.empresa.banco;

import static java.lang.Math.*;

public class TestaInteger {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}

		String stringValida = "5";
		String stringInvalida = "5j";

		try{
			Integer valor = Integer.parseInt(stringValida);			
		} catch(NumberFormatException e){
			System.err.println(e);
		}
		
		try{
			Integer valor = Integer.parseInt(stringInvalida);			
		} catch(NumberFormatException e){
			System.err.println(e);
		}
		
	}

}
