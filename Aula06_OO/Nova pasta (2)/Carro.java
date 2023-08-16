public class Carro extends Veiculo{
    private int numeroPortas;

    public String toString() {
        return "Marca: " + this.getMarca()
               + ", Modelo: " + this.getModelo()
               + ", Ano: " + this.getAno();
    }

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
        
        Math.sqrt(25);
    }

    
}
