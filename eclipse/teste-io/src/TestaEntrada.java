import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaEntrada {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
