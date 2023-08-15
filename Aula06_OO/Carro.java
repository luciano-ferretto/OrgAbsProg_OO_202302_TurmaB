import java.time.LocalDate;

public class Carro extends Veiculo {

    private int numeroPortas;

    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public Carro() {
        this("", "", LocalDate.now().getYear(), 0);
    }
    public Carro(String marca, String modelo, int ano, int numeroPortas){
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n - Número de Portas: " + this.numeroPortas;
    }

}
