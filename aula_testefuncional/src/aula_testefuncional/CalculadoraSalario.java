package aula_testefuncional;

import aula_testefuncional.Enums.Cargo;

public class CalculadoraSalario {

    public static double Calcular(Funcionario f) {
        Cargo cargo = f.getCargo();
        double salarioFinal;
        switch (cargo) {
            case DBA:
                if (f.getSalarioBase() >= 2000) {
                    salarioFinal = f.getSalarioBase() * 0.75;
                } else {
                    salarioFinal = f.getSalarioBase() * 0.85;
                }
                break;
            case DESENVOLVEDOR:
                if (f.getSalarioBase() >= 3000) {
                    salarioFinal = f.getSalarioBase() * 0.8;
                } else {
                    salarioFinal = f.getSalarioBase() * 0.9;
                }
                break;
            case GERENTE:
                if (f.getSalarioBase() >= 5000) {
                    salarioFinal = f.getSalarioBase() * 0.7;
                } else {
                    salarioFinal = f.getSalarioBase() * 0.8;
                }
                break;
            case TESTADOR:
                if (f.getSalarioBase() >= 2000) {
                    salarioFinal = f.getSalarioBase() * 0.75;
                } else {
                    salarioFinal = f.getSalarioBase() * 0.8;
                }
                break;
            default:
                salarioFinal = 0;
                break;
        }

        return salarioFinal;
    }

}
