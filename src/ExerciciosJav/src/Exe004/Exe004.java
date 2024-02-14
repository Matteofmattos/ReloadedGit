package Exe004;

import javax.swing.*;

public class Exe004 {
     private static String poligono;
     private static String continua="S";
    private static String calculo;
    private static Calcula calculadora;

    public static void main(String[] args) {

        while (continua.equals("S")) {
            poligono = JOptionPane.showInputDialog(null,
                    "Digite 1 para utilizar um retângulo, 2 para um circulo e 3 para um triângulo.",
                    "Menu de Polígonos",JOptionPane.INFORMATION_MESSAGE).trim();

            calculo = JOptionPane.showInputDialog(null,
                    "Digite 1 para calcular o perímetro, 2 para calcular a área.",
                    "Menu de Cálculo.",JOptionPane.INFORMATION_MESSAGE).trim();
             validaOption(poligono,calculo);
             JOptionPane.showMessageDialog(null,"Ok, vamos lá!");

             switch (poligono){
                 case "1":
                     String lados = getLados(calculo);
                     String[] ladosArray = lados.split(",");
                     calculadora = new Calcula(new Quadrado(Double.parseDouble(ladosArray[0]),Double.parseDouble(ladosArray[1])));
                     break;
                 case "2":
                     String raio = getLados(calculo);
                     calculadora = new Calcula(new Circulo(Double.parseDouble(raio)));
                     break;
                 case "3":
                     String ladosTriangulo = getLados(calculo);
                     String[] ladosArrayTriangulo = ladosTriangulo.split(",");
                     calculadora = new Calcula(new Triangulo(
                             Double.parseDouble(ladosArrayTriangulo[0]),
                             Double.parseDouble(ladosArrayTriangulo[1]),
                             Double.parseDouble(ladosArrayTriangulo[2])));
                     break;
             }

            JOptionPane.showMessageDialog(null, calculadora.calculate(calculo),"Sucesso!",JOptionPane.INFORMATION_MESSAGE);
             validaContinua();
        }
    }

    private static String getLados(String calculo) {
        switch (poligono) {
            case "1" -> {
                String lado1 = JOptionPane.showInputDialog(null, "Informe a base do retângulo/quadrado: ").trim();
                String lado2 = JOptionPane.showInputDialog(null, "Informe a altura do retângulo/quadrado: ").trim();
                return lado1 + "," + lado2;
            }
            case "2" -> {
                return JOptionPane.showInputDialog(null, "Informe o raio do circulo: ").trim();
            }
            case "3" -> {
                    String base = JOptionPane.showInputDialog(null, "Informe a base do triângulo: ").trim();
                    String altura = JOptionPane.showInputDialog(null, "Informe a altura:  ").trim();
                    String lado = JOptionPane.showInputDialog(null, "Informe o lado: ").trim();
                    return base + "," + altura+","+lado;
                }
            default -> { return null; }
        }
    }

        private static void validaContinua () {
            continua = JOptionPane.showInputDialog(null, "Deseja continuar? S/N").trim().toUpperCase();
            while (!continua.equals("S") && !continua.equals("N"))
                continua = JOptionPane.showInputDialog(null, "Deseja continuar? S/N", "Ops...", JOptionPane.ERROR_MESSAGE).trim().toUpperCase();
        }

        private static void validaOption (String poligono, String calculo){
            while (!poligono.equals("1") && !poligono.equals("2") && !poligono.equals("3")) {

                poligono = JOptionPane.showInputDialog(null,
                        "Digite 1 para utilizar um quadrado,2 para um circulo e 3 para um triângulo.",
                        "Menu de Polígonos", JOptionPane.INFORMATION_MESSAGE).trim();
            }
            while (!calculo.equals("1") && !calculo.equals("2")) {
                calculo = JOptionPane.showInputDialog(null,
                        "Digite 1 para calcular o perímetro, 2 para calcular a área.",
                        "Menu de Cálculo.", JOptionPane.INFORMATION_MESSAGE).trim();
            }
    }
}
