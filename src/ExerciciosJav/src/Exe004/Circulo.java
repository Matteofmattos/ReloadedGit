package Exe004;

public class Circulo implements PoligonoSrategy {
    private Double raio;
    public Circulo(Double raio) {
        this.raio=raio;
    }

    @Override
    public Double calculaArea() {
        return 3.14*(Math.pow(raio,2));
    }

    @Override
    public Double calculaPerimetro() {
        return 2*3.14*raio;
    }
}
