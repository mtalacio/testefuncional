package aula_testefuncional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("entrada.txt");
			BufferedReader reader = new BufferedReader(in);
			
			String line;
			
			while((line = reader.readLine()) != null) {
				String[] results = line.split(",");
				System.out.print(line + " >> ");
				try {
					Funcionario f = new Funcionario(
							results[0].trim().equals("null") ? null : results[0].trim(),
							results[1].trim().equals("null") ? null : results[1].trim(), 
							results[2].trim().equals("null") ? null : Integer.parseInt(results[2].trim()) - 1, 
							results[3].trim().equals("null") ? null : Double.parseDouble(results[3].trim())
							);
					CalculadoraSalario.Calcular(f);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (NullPointerException e) {
					System.out.println("Entrada Nula para campo proibido");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.print("Fim do Arquivo");
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}