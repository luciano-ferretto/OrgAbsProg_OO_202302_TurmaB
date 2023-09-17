public class Retangulo extends FormaGeometrica{

    
    @Override
    public String toString() {
        return "Retangulo: Cor " + this.getCor();
    }

    public Retangulo(String cor, double medida01, double medida02) {
        super(cor, medida01);
        this.medida02 = medida02;
    }

    private double medida02;

    //@Override
    public double calcularArea() {
        return this.getMedida01() * this.getMedida02();
    }

    public double getMedida02() {
        return medida02;
    }

    public void setMedida02(double medida02) {
        this.medida02 = medida02;
    }
    
}
