package aula_testefuncional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        /* Para usar, coloque os dados em um txt chamado "entrada.txt" no root deste projeto com a seguinte formatacao:
		 *  [nome],[email],[cargo(int)], [salarioBase(double)]
         */
        try {
            FileReader in = new FileReader("teste.txt");
            BufferedReader reader = new BufferedReader(in);

            String line;

            while ((line = reader.readLine()) != null) {
                String[] results = line.split(",");
                System.out.print(line + " >> ");
                try {
                    Funcionario f = new Funcionario(
                            results[0].trim().equals("null") ? null : results[0].trim(),
                            results[1].trim().equals("null") ? null : results[1].trim(),
                            results[2].trim().equals("null") ? null : Integer.parseInt(results[2].trim()) - 1,
                            results[3].trim().equals("null") ? null : Double.parseDouble(results[3].trim())
                    );
                    if (Double.toString(CalculadoraSalario.Calcular(f)).equals(results[4].trim())) {
                        System.out.println("Saída Esperada");
                    } else {
                        System.out.println("Saída Inesperada, saída: " + CalculadoraSalario.Calcular(f));
                    }

                } catch (NullPointerException e) {
                    String errorMsg = "Entrada Nula para campo proibido";
                    if (errorMsg.equals(results[4].trim())) {
                        System.out.println("Saída Esperada");
                    } else {
                        System.out.println("Saída Inesperada, saída: " + errorMsg);
                    }
                } catch (Exception e) {
                    if (e.getMessage().equals(results[4].trim())) {
                        System.out.println("Saída Esperada");
                    } else {
                        System.out.println("Saída Inesperada, saída: " + e.getMessage());
                    }
                }
            }

            System.out.print("Fim do Arquivo");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
