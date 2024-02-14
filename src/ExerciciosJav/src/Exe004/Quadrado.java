package Exe004;

import javax.swing.*;

public class Quadrado implements PoligonoSrategy {

    private Double lado1;
    private Double lado2;

    public Quadrado(Double lado1,Double lado2) {
        this.lado1=lado1;
        this.lado2=lado2;
    }

    @Override
    public Double calculaArea() {
        return lado1*lado2;
    }

    @Override
    public Double calculaPerimetro() {
        return (2*lado1+2*lado2);
    }

}
