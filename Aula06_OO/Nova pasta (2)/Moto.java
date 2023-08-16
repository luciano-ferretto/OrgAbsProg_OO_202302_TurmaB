public class Moto extends Veiculo{
    private boolean partidaEletrica;
   
    public Moto() {
        
    }
    public Moto(String marca, String modelo, int ano, boolean partidaEletrica) {
        super(marca, modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }
    public boolean getPartidaEletrica() {
        return partidaEletrica;
    }
    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
}
