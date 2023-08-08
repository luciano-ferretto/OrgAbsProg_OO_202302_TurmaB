import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        try {
            System.out.println("Digite seu nome");
            String nome = lerTeclado.next();
            lerTeclado.nextLine();
            System.out.println("Digite sua idade:");
            int idade = lerTeclado.nextInt();
            System.out.println("Seu nome é: " + nome + ", e sua idade " + idade);
        } catch (Exception e) {
            System.out.println("Dados inválidos!");
        }
        lerTeclado.close();
    }
}
