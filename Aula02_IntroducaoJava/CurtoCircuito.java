public class CurtoCircuito {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        
        if (num2 > 0 && num1 % num2 == 0) {
            System.out.println(num2 + " é fator de " + num1);
        }

        num2 = 0;
        /*Neste exemplo não ocorrerá erro, pois com o operador 
         * de curto-circuito impedirá que a segunda condição,
         * que envole uma divisão, seja verificada.
         */
        if (num2 > 0 && num1 % num2 == 0) { 
            System.out.println(num2 + " é fator de " + num1);
        }
        /*Neste exemplo teremos um erro em tempo de execução
         * Pois a segunda condição será verificada independente
         * do resultado da primeira. 
         */
        if (num2 > 0 && num1 % num2 == 0) {
            System.out.println(num2 + " é fator de " + num1);
        }
    }
}
