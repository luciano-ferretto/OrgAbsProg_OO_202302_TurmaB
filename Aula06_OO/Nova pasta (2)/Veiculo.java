import java.time.LocalDate;

public class Veiculo {
    public static int contador = 0;
    private String marca;
    private String modelo;
    private int ano;

    public String toString() {
        return "Marca: " + this.marca
               + ", Modelo: " + this.modelo
               + ", Ano: " + this.ano;
    }




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
        
    }
    Veiculo(String marca) {
        this(marca, "Modelo não definido");
    }
    Veiculo(String marca, String modelo) {
        this(marca, modelo, -1);
    }
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        contador++;
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
        return this.calcularTempoUso(LocalDate.now().getYear());
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