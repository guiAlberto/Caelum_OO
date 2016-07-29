package br.com.empresa.banco;

public class ExercicioString {

	public static void main(String[] args) {
		String string = "Guilherme";
		for(int i = 0; i < string.length(); i++){
			System.out.println(string.charAt(i));
		}
		
		String palindromo1 = "Socorram-me, subi no ônibus em Marrocos";
		String palindromo2 = "anotaram a data da maratona";
		
		System.out.println(getCaracteresInvertidos(palindromo1));
		System.out.println(getCaracteresInvertidos(palindromo2));
		System.out.println(getPalavrasInvertidas(palindromo1));
		System.out.println(getPalavrasInvertidas(palindromo2));
		
		convertaParaNumero("1234");
	}
	
	private static void convertaParaNumero(String string) {
		int numero = 0;
		int aux = 0;
		for(int i = string.length() - 1; i >= 0; i--){
			numero += Character.getNumericValue(string.charAt(i)) * Math.pow(10, aux++);
		}
		System.out.println(numero);
	}

	private static String getPalavrasInvertidas(String palindromo) {
		String[] palavras = palindromo.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = palavras.length - 1; i >= 1; i--){
			stringBuilder.append(palavras[i]);
			stringBuilder.append(" ");
		}
		stringBuilder.append(palavras[0]);
		return stringBuilder.toString();
	}

	public static String getCaracteresInvertidos(String palindromo){
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = palindromo.length() - 1; i >= 0 ; i--){
			stringBuilder.append(palindromo.charAt(i));
		}
		return stringBuilder.toString();
	}

}
