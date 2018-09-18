package aula_testefuncional;

import aula_testefuncional.Enums.Cargo;

public class Funcionario {
	private String nome;
	private String email;
	private Cargo cargo;
	private double salarioBase;
	
	public Funcionario(String nome, String email, int cargo, double salarioBase) throws Exception {
		setNome(nome == null ? null : nome.toUpperCase());
		setEmail(email);
		setCargo(cargo);
		setSalarioBase(salarioBase);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if(Validacao.ValidarNome(nome))
			this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		if(Validacao.ValidarEmail(email))
			this.email = email;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) throws Exception {
		this.cargo = Validacao.ValidarCargo(cargo);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) throws Exception {
		if(Validacao.ValidarSalario(salarioBase))
			this.salarioBase = salarioBase;
	}
}
