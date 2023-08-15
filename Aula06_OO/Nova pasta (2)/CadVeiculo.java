import java.time.LocalDate;

public class CadVeiculo {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Veiculo meuVeiculo = new Veiculo("Volkswagen",
        //    "Fusca do Itamar");
        
        Veiculo meuVeiculo = new Veiculo("Volkswagen", "Fusca do Itamar", 1995);
        //meuVeiculo.marca = "Volkswagen";
        //meuVeiculo.modelo = "Fusca do Itamar";
        //meuVeiculo.ano = 1995;

        Veiculo clone1 = meuVeiculo.criarCopiaAPartirDeMim();
        
        int anoAtual = LocalDate.now().getYear();
        int tempo = meuVeiculo.calcularTempoUso(anoAtual);
        int tempoEm2030 = meuVeiculo.calcularTempoUso(2030);
        
        Veiculo outroFusca = meuVeiculo;
        outroFusca.ano = 1989;
        meuVeiculo.ligar();

        
    }
}
