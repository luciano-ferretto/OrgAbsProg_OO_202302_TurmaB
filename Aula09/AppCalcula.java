import java.util.Scanner;

public class AppCalcula {
    public static void imprimeToStringMaiusculo(Object objeto) {
        System.out.println(objeto.toString().toUpperCase());
    }

    public static void imprimeArea(FormaGeometrica forma) {
        System.out.println(forma.calcularArea());
    }

    public static void main(String[] args) {
        TesteConfig teste;
        Object varObject = new Object();
        Retangulo varRetangulo = (Retangulo) varObject;

        Retangulo ret1 = new Retangulo("ddd", 0, 0);
        imprimeToStringMaiusculo(ret1);
        Quadrado quad1 = new Quadrado("cor qualquer", 0);
        imprimeToStringMaiusculo(quad1);
        
        Scanner scan = new Scanner(System.in);
        String mensagemInicial = """
                --------------------------------------
                Cálculo Rápido para Formas Geométricas
                --------------------------------------
                Informe qual o tipo de forma você deseja trabalhar:
                1 - Quadrado;
                2 - Retangulo;
                0 - Sair;
                """;
        System.out.println(mensagemInicial);
        int opcao = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite a cor da Forma");
        String cor = scan.nextLine();
        System.out.println("Digite o valor da medida 01");
        double medida01 = scan.nextDouble();
        scan.nextLine();

        if (opcao == 1) {
            Quadrado quadrado = new Quadrado(cor, medida01);
            System.out.println("Área: " + quadrado.calcularArea());
        } else if (opcao == 2) {
            System.out.println("Digite o valor da medida 02");
            double medida02 = scan.nextDouble();
            Retangulo ret = new Retangulo(cor, medida01, medida02);
            System.out.println("Área: " + ret.calcularArea());
        }
    }
}
