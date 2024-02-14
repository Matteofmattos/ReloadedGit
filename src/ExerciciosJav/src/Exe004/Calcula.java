package Exe004;

public class Calcula  {

    private final PoligonoSrategy poligono;

    public Calcula(PoligonoSrategy poligono) {this.poligono=poligono; }

    public String calculate(String calculo){
        return switch (calculo) {
            case "1" -> String.valueOf(this.poligono.calculaPerimetro());
            case "2" -> String.valueOf(this.poligono.calculaArea());
            default -> null;
        };
    }
}
