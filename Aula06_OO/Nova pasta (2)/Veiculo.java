import java.time.LocalDate;

public class Veiculo {
    String marca;
    String modelo;
    int ano;

    Veiculo(String marca, String modelo, int ano){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    Veiculo criarCopiaAPartirDeMim() {
        //Veiculo copia = new Veiculo();
        //copia.marca = this.marca;
        //copia.modelo = this.modelo;
        //copia.ano = this.ano;
        return this;
        //return copia;
    }

    int calcularTempoUso() {
        
    }

    int calcularTempoUso(int anoBase) {
        int tempoUso = anoBase - this.ano;
        return tempoUso;
        //return anoBase - this.ano;
    }
    void ligar() {
        System.out.println("O motor do " + this.modelo + " esta ligando!");
    }
}