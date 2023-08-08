public class ExemploForTradicional01 {
    public static void main(String[] args) {
        /*EXEMPLO DE FOR TRADICIONAL
          Neste loop estamos declarando uma variável de controle que nomeamos de "i"
                   e a inicializamos com o valor 1 (um)
          A cada iteração do bloco, ou seja, a cada loop haverá o incremento de "+ 1" (mais um)
                   na variável de controle "i"
          O loop ficará ativo enquanto a variável "i" for menor ou igual à 100 (cem),
                   ou seja, o loop será executado 100 (cem) vezes
        */
        for (int i = 1; i <= 100; i++) {
            double raiz = Math.sqrt(i);
            System.out.println("A raiz quadrada de " + i + " é: " + raiz);
        }

        /*EXEMPLO DE FOR TRADICIONAL 
          abaixo estamos declarando uma variável de controle que nomeamos de "i"
                   e a inicializamos com o valor 100 (cem)
          A cada iteração do bloco, ou seja, a cada loop haverá o decremento de "- 5" (menos cinco)
                   na variável de controle "i"
          O loop ficará ativo enquanto a variável "i" for maior ou igual à 1 (um),
                   ou seja, o loop será executado 20 (vinte) vezes
        */
        for (int i = 100; i >= 1; i -= 5) {
            double raiz = Math.sqrt(i);
            System.out.println("A raiz quadrada de " + i + " é: " + raiz);
        }
    }
}
