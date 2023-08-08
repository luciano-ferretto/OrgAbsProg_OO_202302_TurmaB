public class ExemploForEach {
    public static void main(String[] args) {
        int colecaoInteiros[] = {9, 1, 8, 2, 7, 3, 6, 4, 5, 0};
        for (int variavel : colecaoInteiros) {
            System.out.println("Número: " + variavel);
        }

        // Também pode ser utilizado com a palavra-chave var
        for (var variavel : colecaoInteiros) {
            System.out.println("Número: " + variavel);
        }
    }
}
