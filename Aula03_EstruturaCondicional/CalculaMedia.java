import java.util.Scanner; //Biblioteca utilizada para acessar os dados digitados pelo usuário.

class CalculaMedia { // Nessa classe não vamos realizar o tratamento de exceções.

    public static void main(String args[]) {
        Scanner lerTeclado = new Scanner(System.in); // Inicializa o objeto Scanner passando qual será a
                                                     // origem dos dados. Neste caso será a entrada no terminal
        // Solicita ao usuário que informe suas
        System.out.println("Informe o valor da primeira Nota:");
        double nota01 = lerTeclado.nextDouble();
        System.out.println("Informe o valor da segunda Nota:");
        double nota02 = lerTeclado.nextDouble();
        lerTeclado.close();
        // Calcula a média aritmética
        double mediaAritimetica = (nota01 + nota02) / 2;
        System.out.printf("A média aritimética é %.2f \n %n", mediaAritimetica);

        //Exemplo utilizando a estrutura if comum
        if (mediaAritimetica >= 7) { // com o uso chaves {}
            System.out.println("PARABÉNS!!! Você foi aprovado");
        } else                       // sem o uso das chaves {}
             System.out.println("Infelizmente você não alcançou a média :-(");

        // Exemplo utilizando a estrutura if-aninhado
        if (mediaAritimetica >= 7)
            System.out.println("PARABÉNS!!! Você foi aprovado");
        else {
            if (mediaAritimetica >= 3)
                System.out.println("Infelizmente você deverá realizar o Exame :-(");
            else
                System.out.println("Infelizmente você foi Reprovado! :´(");
        }

        // Exemplo utilizando a estrutura if-else-if
        if (mediaAritimetica >= 7)
            System.out.println("PARABÉNS!!! Você foi aprovado");
        else if (mediaAritimetica >= 3)
            System.out.println("Infelizmente você deverá realizar o Exame :-(");
        else
            System.out.println("Infelizmente você foi Reprovado! :´(");

    }
}
