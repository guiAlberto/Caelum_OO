import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		OutputStream os = new FileOutputStream("backup.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		do {
			bw.write(entrada.nextLine() + (entrada.hasNextLine() ? "\n" : ""));
		} while (entrada.hasNextLine());
		entrada.close();
		bw.close();
	}

}
