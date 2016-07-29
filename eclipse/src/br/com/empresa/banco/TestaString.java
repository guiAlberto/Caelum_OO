package br.com.empresa.banco;

public class TestaString {

	public static void main(String[] args) {
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);

		// Exerício 2
		findStringIntoAnother();
		removeLeftWhitespaces();
		removeRightWhitespaces();
		removeEdgesWhitespaces();
		countCharacter();

	}

	private static void countCharacter() {
		String string = "bla";
		System.out.println(string.length());
	}

	private static void removeEdgesWhitespaces() {
		String string = "     bla     ";
		System.out.println(string.trim());

	}

	private static void removeRightWhitespaces() {
		String string = "     bla     ";
		int i = string.length() - 1;
		while (Character.isWhitespace(string.charAt(i))) {
			i--;
		}
		System.out.println(string.substring(0, i + 1));

	}

	private static void removeLeftWhitespaces() {
		String string = "     bla     ";
		int i = 0;
		while (Character.isWhitespace(string.charAt(i))) {
			i++;
		}
		System.out.println(string.substring(i));

	}

	private static void findStringIntoAnother() {
		String string1 = "Guilherme";
		String string2 = "ilhe";
		System.out.println(string1.contains(string2));
	}

}
