import java.util.Scanner;

public class CadVeiculoEstruturado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String marca;
        String modelo;
        int ano;
        System.out.println("Informe a marca do seu veículo:");
        marca = scan.nextLine();
        System.out.println("Informe o modelo do seu veículo:");
        modelo = scan.nextLine();
        System.out.println("Agora informe o ano do seu veículo:");
        ano = scan.nextInt();
        scan.nextLine();
        System.out.println("Seu veículo é um " + marca + " " + modelo + " do ano " + ano);
        scan.close();
    }
}
