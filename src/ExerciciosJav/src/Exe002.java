import javax.swing.JOptionPane;

public class Exe002 {

    public static void main(String[] args) {

        String  resposta = JOptionPane.showInputDialog("Informe o valor desejado: ").trim();

        while ( !isNumeric(resposta)){
            resposta = JOptionPane.showInputDialog("Informe o valor desejado: ").trim();
        }

        JOptionPane.showMessageDialog(null, "Sucessor: "+String.valueOf(Integer.valueOf(resposta)-1), "Pronto.", JOptionPane.INFORMATION_MESSAGE);
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
