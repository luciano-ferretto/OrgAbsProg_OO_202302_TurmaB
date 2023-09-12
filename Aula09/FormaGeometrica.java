public abstract class FormaGeometrica {
    private String cor;
    private double medida01;

    public FormaGeometrica(String cor, double medida01) {
        this.cor = cor;
        this.medida01 = medida01;
    }

    public abstract double calcularArea();

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getMedida01() {
        return medida01;
    }
    public void setMedida01(double medida01) {
        this.medida01 = medida01;
    }
    
}