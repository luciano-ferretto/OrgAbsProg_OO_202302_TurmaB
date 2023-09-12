public class ExemploMetodo {
    /*a palavra chave "static" serve para podermos 
     * invocar (chamar) o método sem uma instância
     * da classe
    */
    static void imprimeOi() { //"void" significa que o método NÃO terá retorno
        System.out.println("OI");
    }
    static int soma(int a, int b) {//os parâmetros de entrada devem ser tipados
        return a + b;
    }
    /*Se os parâmetros de entrada são diferentes
     * os métodos podem ter o mesmo nome
     * Isso se chama de SOBRECARGA DE MÉTODOS
     */
    static double soma(double a, double b) { 
        return a + b;
    }
    /*Como a linguagem é compilada, é possível invocar (chamar)
     * os métodos em qualquer parte do código
     */
    public static void main(String[] args) {
        imprimeOi();

        int resultadoInt = soma(2, 3);
        System.out.println(resultadoInt);

        double resultadoDouble = soma(2.5, 3.5);
        System.out.println(resultadoDouble);
    }
}
