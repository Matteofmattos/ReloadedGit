import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exe003 {
    
    public static void main(String[] args) {

        String quantidade = JOptionPane.showInputDialog("Quantos valores deseja utilizar? ").trim();

        while ( !isNumeric(quantidade)){
            quantidade = JOptionPane.showInputDialog("Quantos valores deseja utilizar? ").trim();
        }

        int[] valores = new int[Integer.parseInt(quantidade)];
        int[] resultados = new int[Integer.parseInt(quantidade)];

        int i=0;
        while ( i<valores.length){
            String value = JOptionPane.showInputDialog("Informe o "+(i+1)+" valor:").trim();

            while ( !isNumeric(value)){
                value = JOptionPane.showInputDialog("Informe o "+(i+1)+" valor:").trim();  }

            valores[i] = ((Integer.parseInt(value)));
            resultados[i] = (Integer.parseInt(value)-1);
            i++;
        }
        
        for (int j=0; j<valores.length;j++ ){
            JOptionPane.showMessageDialog(null, (j+1)+"º Valor: "+ valores[j]+ "\nAntecessor: "+resultados[j],"Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
    }

        private static Boolean isNumeric(String resposta) {
            try {
                Integer.valueOf(resposta);
                return true;
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Informe um valor numérico.", "Ops...", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
}
