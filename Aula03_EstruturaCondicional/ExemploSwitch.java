import java.util.Random; //Biblioteca utilizada para gerar números aleatórios

public class ExemploSwitch {
    public static void main(String[] args) {
        Random gerador = new Random();
        int limit = 10;
        int numeroAleatorio = gerador.nextInt(limit);
        switch (numeroAleatorio) {
            case 0:
                System.out.println("O valor gerado é igual a ZERO");
                break;
            case 1:
                System.out.println("O valor gerado é igual a UM");
                break;
            case 2:
                System.out.println("O valor gerado é igual a DOIS");
                break;
            case 3:
                System.out.println("O valor gerado é igual a TRÊS");
                break;
            case 4:
                System.out.println("O valor gerado é igual a QUATRO");
                break;
            default:
                System.out.println("O valor gerado é maior ou igual a CINCO");
                break;
        }
    }
}
