import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CadVeiculo {
    public static void main(String[] args) {

        // Invocando um método Estático, ou seja, não há a necessidade
        // de instanciar um objeto a partir da classe Calculadora
        int resultadoSomaInteiro = Calculadora.somarInteiros(2, 2);
        // Instanciando um novo Objeto apartir da classe Veiculo
        // passando parâmetros no método construtor
        Veiculo veiculoTeste = new Veiculo("Ford", "Fusion", 2020);

        // Instanciando um novo veículo e alterando seus atributos
        Veiculo meuVeiculo = new Veiculo();
        meuVeiculo.setMarca("Fiat");
        meuVeiculo.setModelo("Uno");
        meuVeiculo.setAno(2003);
        meuVeiculo.ligar(); // Invocando o método ligar()

        // Exemplo de Polimorfismo estático
        // Onde o método calculaTempo retorna dois valores diferentes conforme o
        // parâmetro passado
        System.out.println("A idade atual do meu veículo é "
                + meuVeiculo.calculaTempoUso() + " anos");
        System.out.println("A idade do meu veículo em 2030 será "
                + meuVeiculo.calculaTempoUso(2030) + " anos");

        // Exemplo de atribuição por refência
        Veiculo outroUno = meuVeiculo;
        outroUno.setAno(2010);
        System.out.println("O ano do meu veículo é " + meuVeiculo.getAno());
        System.out.println("O ano do outro uno é " + outroUno.getAno());

        // Instanciando um segundo veículo
        Veiculo teuVeiculo = new Veiculo();
        teuVeiculo.setMarca("Volkswagen");
        teuVeiculo.setModelo("Fusca do Itamar");
        teuVeiculo.setAno(1995);

        int anoAtual = 2023;
        int tempoUso = teuVeiculo.calculaTempoUso(anoAtual);
        System.out.println("O tempo de uso desse carro é "
                + tempoUso + " anos.");
        System.out.println("O tempo de uso desse carro é "
                + teuVeiculo.calculaTempoUso(2023) + " anos.");
        // Exemplo para criar uma cópia do objeto através do método específico para isso
        Veiculo novoVeiculo = teuVeiculo.criarCopiaAPartirDeOutro(teuVeiculo);


        Carro carro = new Carro("Ford", "Fusion Hibryd", 2022, 4);
        Moto moto = new Moto("Honda", "Falcon 400", 2026, true);

        List<Veiculo> listaVeiculos = Arrays.asList(carro, moto);
        imprimeVeiculos(listaVeiculos);

    }

    public static void imprimeVeiculos(List<Veiculo> veiculos) {
        int i = 1;
        for (Veiculo veiculo : veiculos) {
            System.out.println("Veículo " + i++);
            System.out.println(veiculo.toString());
            System.out.println("----------------------------------------");
        }
    }
}
