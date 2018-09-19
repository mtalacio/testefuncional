package aula_testefuncional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import aula_testefuncional.Enums.Cargo;

public class Validacao {

    public static boolean ValidarNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("Nome Nulo!");
        } else if (nome.equals("")) {
            throw new Exception("Nome Vazio!");
        } else if (nome.length() <= 5) {
            throw new Exception("Nome Menor que 5 caracteres!");
        } else if (nome.length() > 100) {
            throw new Exception("Nome Maior que 100 caracteres!");
        } else {
            Pattern p = Pattern.compile("^(?=.{5,20}$)(?!.* {2,})[a-zA-Z][a-zA-Z ]*[a-zA-Z]$");
            Matcher m = p.matcher(nome);
            
            if(!m.matches())
                throw new Exception("Nome Invalido");
        }
        
        return true;
    }

    public static boolean ValidarEmail(String email) throws Exception {
        if (email == null) {
            throw new Exception("E-mail nulo!");
        }

        Pattern p = Pattern.compile("[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}");
        Matcher m = p.matcher(email);
        if (!m.matches()) {
            throw new Exception("E-mail invalido!");
        }

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
        if (salario <= 0) {
            throw new Exception("Salario Invalido");
        }

        return true;
    }

}
