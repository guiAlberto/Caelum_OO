import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileEditor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o texto: ");
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("arquivoEntrada.txt"));
			do {
				bw.write(scanner.nextLine() + (scanner.hasNextLine() ? "\n" : ""));
			} while (scanner.hasNextLine());
			bw.close();
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
