package Exe004;

public class Triangulo implements PoligonoSrategy {
    private Double base;
    private Double altura;
    private Double lado;

    public Triangulo(Double base,Double altura,Double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public Double calculaArea() {
        return (base*altura)/2;
    }

    @Override
    public Double calculaPerimetro() {
        return 2*lado+base;
    }
}
