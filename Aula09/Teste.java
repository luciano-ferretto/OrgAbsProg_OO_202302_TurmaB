public class Teste {
    public static void main(String[] args) {
        Animal animal01 = new Gato();
        Animal animal02 = new Cachorro();
        /*...
         * restante do código
         * ...
         */
        
        Gato gato1 = (Gato) animal01;
        Gato gato2 = (Gato) animal01;
        gato1.emitirSom();
        gato2.emitirSom();
    }
}
class Animal {
    String nome;
    void emitirSom() {
        System.out.println("Animal emite som!");
    }
}
class Gato extends Animal{
    void emitirSom() {
        System.out.println("Gato Mia");
    }
}
class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Cachorro Late");
    }
}


