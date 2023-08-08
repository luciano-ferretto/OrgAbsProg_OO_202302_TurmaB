import java.util.Scanner;
public class ExemploWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Neste exemplo a execução permanece em loop enquanto a variável opcao contiver o valor 'S' */
        char opcao = 'S';
        while (opcao == 'S') {
            System.out.println("Digite 'S' se deseja permanecer aqui?");
            opcao = scan.next().charAt(0);
        }
        scan.close();
    }
}
