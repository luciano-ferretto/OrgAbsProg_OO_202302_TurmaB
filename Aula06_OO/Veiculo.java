import java.time.LocalDate;

class Veiculo {
    public static int contador = 0;
    private String marca;
    private String modelo;
    private int ano;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    Veiculo() {
        this("","",LocalDate.now().getYear());
    }
    Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        Veiculo.contador++;
    }
    /*
    // Exemplos não mais utilizados, pois ao definir a classe Veiculo
    // como abstrata, esta não poderá mais ser instanciada.
    Veiculo criarCopiaAPartir() {
        Veiculo copia = new Veiculo();
        copia.marca = this.marca;
        copia.modelo = this.modelo;
        copia.ano = this.ano;
        return copia;
    }
    Veiculo criarCopiaAPartirDeOutro(Veiculo veiculoOrigem) {
        Veiculo copia = new Veiculo();
        copia.marca = veiculoOrigem.marca;
        copia.modelo = veiculoOrigem.modelo;
        copia.ano = veiculoOrigem.ano;
        return copia;
    }
    */
    Veiculo criarCopiaAPartirDeOutroERRADO(Veiculo veiculoOrigem) {
        Veiculo copia = veiculoOrigem;
        return copia;
    }

    int calculaTempoUso() {
        int anoAtual = LocalDate.now().getYear();
        return calculaTempoUso(anoAtual);
    }
    int calculaTempoUso(int anoBase) {
        int tempoUso = anoBase - this.ano;
        return tempoUso;
    }
    
    void ligar() {
        System.out.println("O veículo está ligando");
    }
    void desligar() {
        System.out.println("O veículo está desligando");
    }
    @Override
    public String toString() {
        return "Veículo: " + this.marca + " - " + this.modelo + " - Ano: " + this.ano;
    }

    
}
