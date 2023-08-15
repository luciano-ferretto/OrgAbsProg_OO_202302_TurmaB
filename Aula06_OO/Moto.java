import java.time.LocalDate;

public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public boolean getPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public Moto() {
        this("", "", LocalDate.now().getYear(), false);
    }

    public Moto(String marca, String modelo, int ano, boolean partidaEletrica) {
        super(marca, modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String toString() {
        String partidaString = partidaEletrica ? "Sim" : "Não";
        return super.toString()
                + "\n - Partida Elétrica: " + partidaString;
    }
}
