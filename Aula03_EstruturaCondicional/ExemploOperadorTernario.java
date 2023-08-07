import java.util.Scanner;

public class ExemploOperadorTernario {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero = lerTeclado.nextInt();
        lerTeclado.close();

        String resultado = numero % 2 == 0  ? "Par" : "Ímpar";
        System.out.println("O número é " + resultado);
    }
}
