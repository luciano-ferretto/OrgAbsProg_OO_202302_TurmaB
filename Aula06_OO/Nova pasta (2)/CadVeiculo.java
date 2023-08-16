import java.time.LocalDate;

public class CadVeiculo {
    
    public static void main(String[] args) throws CloneNotSupportedException {

        Carro meuCarro = new Carro("Kia","Cerato",2011,4);

        System.out.println(meuCarro.toString());


        Moto minhaMoto = new Moto();
        minhaMoto.setMarca("Honda");
        minhaMoto.setModelo("Falcon 400");
        minhaMoto.setAno(2008);
        minhaMoto.setPartidaEletrica(true);




        //Veiculo meuVeiculo = new Veiculo("Volkswagen",
        //    "Fusca do Itamar");
        System.out.println("A Classe Veículo foi instaciada " 
            + Veiculo.contador + " vezes");


        Veiculo veiculoQualquer = new Veiculo("Ford");
        Veiculo veiculo02 = new Veiculo("Chevrolet", "Corsa");
        Veiculo meuVeiculo = new Veiculo("Volkswagen", "Fusca do Itamar", 1995);

        System.out.println("A Classe Veículo foi instaciada " 
            + Veiculo.contador + " vezes");

        meuVeiculo.setMarca("Fiat");
        System.out.println(meuVeiculo.getMarca());

        //meuVeiculo.marca = "Volkswagen";
        //meuVeiculo.modelo = "Fusca do Itamar";
        //meuVeiculo.ano = 1995;

        Veiculo clone1 = meuVeiculo.criarCopiaAPartirDeMim();
        
        //int anoAtual = LocalDate.now().getYear();
        int tempo = meuVeiculo.calcularTempoUso();
        int tempoEm2030 = meuVeiculo.calcularTempoUso(2030);
        
        Veiculo outroFusca = meuVeiculo;
        outroFusca.setAno(1989);
        meuVeiculo.ligar();

        
    }
}
