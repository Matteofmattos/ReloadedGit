// Escrever um algoritmo que recebe um valor e escreve seu antecessor.

import javax.swing.JOptionPane;

public class Exe001 {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o valor: ").trim();

        Integer result = (Integer.valueOf(valor)-1);
        JOptionPane.showMessageDialog(null, "Resposta: "+result,"pronto!",JOptionPane.INFORMATION_MESSAGE);

    }
}
