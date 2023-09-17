package br.edu.atitus.meuprimeiroprojeto.util;

public class ValidadorCPF {

    public static boolean validarCPF(String cpf) {
        // Remova todos os caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifique se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifique se todos os dígitos são iguais (caso contrário, será considerado inválido)
        char firstDigit = cpf.charAt(0);
        boolean todosDigitosIguais = true;
        for (char c : cpf.toCharArray()) {
            if (c != firstDigit) {
                todosDigitosIguais = false;
                break;
            }
        }

        if (todosDigitosIguais) {
            return false;
        }

        // Validação dos dígitos verificadores
        int[] digitos = new int[11];
        for (int i = 0; i < 11; i++) {
            digitos[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += digitos[i] * (10 - i);
        }

        int resto1 = soma1 % 11;
        int primeiroDigitoVerificador = (resto1 < 2) ? 0 : (11 - resto1);

        if (digitos[9] != primeiroDigitoVerificador) {
            return false;
        }

        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += digitos[i] * (11 - i);
        }

        int resto2 = soma2 % 11;
        int segundoDigitoVerificador = (resto2 < 2) ? 0 : (11 - resto2);

        return digitos[10] == segundoDigitoVerificador;
    }

}
