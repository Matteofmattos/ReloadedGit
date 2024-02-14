package Exceptions;

import javax.swing.JOptionPane;

public class AppClient {
    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog(null,"Informe o código do cliente",JOptionPane.INFORMATION_MESSAGE);
        
        try {
            ClientService.consultarCliente(option);
        } catch (ClienteNotFound2 e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
}
