import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = ler.nextLine();
            System.out.println("Digite seu gênero");
            //String genero = ler.nextLine();
            //char generoChar = genero.charAt(0);
            char generoChar = ler.nextLine().charAt(0);
            System.out.println("Digite sua altura:");
            double altura = ler.nextDouble();
            ler.nextLine();
            System.out.println("Digite seu peso:");
            double peso = ler.nextDouble();
            ler.nextLine();
    
            double imc = peso / Math.pow(altura, 2);
            System.out.printf("Seu IMC é: %.2f --", imc);
    
            switch (generoChar) {
                case 'M', 'm':
                    if (imc >= 40) System.out.println("Obesidade Mórbida");
                    else if (imc >= 30) System.out.println("Obesidade Moderada");
                    else if (imc >= 25) System.out.println("Obesidade Leve");
                    else if (imc >= 20) System.out.println("Peso Normal");
                    else System.out.println("Abaixo do Normal");
                    break;
                case 'F', 'f', 'N', 'n':
                    if (imc >= 39) System.out.println("Obesidade Mórbida");
                    else if (imc >= 29) System.out.println("Obesidade Moderada");
                    else if (imc >= 24) System.out.println("Obesidade Leve");
                    else if (imc >= 19) System.out.println("Peso Normal");
                    else System.out.println("Abaixo do Normal");
                    break;
                default:
                    System.out.println("Gênero informado inválido!");
                    break;
            }
        } catch (Exception e) {
            if (e instanceof InputMismatchException)
                System.out.println("Houve erros de digitação. Por favor tente novamente!");
            else
                System.out.println(e.getMessage());
        }

    }
}