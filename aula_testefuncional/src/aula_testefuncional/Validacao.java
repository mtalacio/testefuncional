package aula_testefuncional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import aula_testefuncional.Enums.Cargo;

public class Validacao {
	 
	public static boolean ValidarNome(String nome) throws Exception {
		if(nome == null) {
			throw new Exception("Nome Nulo!");
		} else if (nome.equals("")) {
			throw new Exception("Nome Vazio!");
		} else if (nome.length() <= 5) {
			throw new Exception("Nome Menor que 5 caracteres!");
		} else if (nome.length() > 100) {
			throw new Exception("Nome Maior que 100 caracteres!");
		} else {
			return true;
		}	
	}
	
	public static boolean ValidarEmail(String email) throws Exception {
            if(email == null)
		throw new Exception("E-mail nulo!");
		
            String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
            Pattern p = Pattern.compile(ePattern);
            Matcher m = p.matcher(email);
            if(!m.matches())
        	throw new Exception("E-mail Invalido!");
        
            return true;
	}
	
	public static Cargo ValidarCargo(int cargo) throws Exception {	
		try {
			return Cargo.values()[cargo];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new Exception("Cargo Invalido!");
		}
	}
	
	public static boolean ValidarSalario(double salario) throws Exception {
		if(salario <= 0)
			throw new Exception("Salario Invalido");
		
		return true;
	}
		
}
