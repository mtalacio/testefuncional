package aula_testefuncional;

import aula_testefuncional.Enums.Cargo;

public class CalculadoraSalario {
	
	public static void Calcular(Funcionario f) {
		Cargo cargo = f.getCargo();
		switch(cargo) {
		case DBA: 
			if(f.getSalarioBase() >= 2000)
				System.out.println("Salario Final de " + f.getNome() + " = R$" + f.getSalarioBase() * 0.75);
			else
				System.out.println("Salario Final de " + f.getNome() + " = R$" + f.getSalarioBase() * 0.85);
			break;
		case DESENVOLVEDOR:
			if(f.getSalarioBase() >= 3000)
				System.out.println("Salario Final de " + f.getNome() + " = R$" + f.getSalarioBase() * 0.8);
			else
				System.out.println("Salario Final de " + f.getNome() + " = R$" + f.getSalarioBase() * 0.9);
			break;
		case GERENTE:
			if(f.getSalarioBase() >= 5000)
				System.out.println("Salario Final de " + f.getNome() + " = R$" + f.getSalarioBase() * 0.7);
			else
				System.out.println("Salario Final de " + f.getNome() + " = R$" + f.getSalarioBase() * 0.8);
			break;
		case TESTADOR:
			if(f.getSalarioBase() >= 2000)
				System.out.println("Salario Final de " + f.getNome() + " = R$" + f.getSalarioBase() * 0.75);
			else
				System.out.println("Salario Final de " + f.getNome() + " = R$" + f.getSalarioBase() * 0.80);
			break;
		default:
			break;
		}

	}
	
}
