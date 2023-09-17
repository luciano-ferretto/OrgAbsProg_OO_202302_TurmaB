package br.edu.atitus.meuprimeiroprojeto;

import br.edu.atitus.meuprimeiroprojeto.util.ValidadorCPF;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		String cpf = "999.999.999-99";
		boolean cpfValido = ValidadorCPF.validarCPF(cpf);
		System.out.println(cpfValido);
	}
}
