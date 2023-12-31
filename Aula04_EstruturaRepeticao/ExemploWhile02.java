import java.util.Scanner;
public class ExemploWhile02 {
    public static void funcao(double saldo, double cheque, Scanner scan) {
        System.out.println(saldo + cheque);
        scan.nextLine();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        funcao(33, 330, scan);
        /*Neste exemplo a execução permanece em loop enquanto a variável opcao contiver o valor 'S' 
        * a grande diferença para a estrutura while tradicional é que a variável opcao não precisa
        * possuir o valor 'S' no início;
        */
        char opcao = scan.next().charAt(0);
        do {
            System.out.println("Digite 'S' se deseja permanecer aqui?");
            opcao = scan.next().charAt(0);
        } while (opcao == 'S');
        scan.close();
    }


    
}
