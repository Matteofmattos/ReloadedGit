package Exceptions;

public class ClientService {

    public static void consultarCliente(String option) throws ClienteNotFound2 {
        
        try {
            ClienteDao.consultarCliente();
        } catch ( ClientNotFoundException e ) { 
            throw new ClienteNotFound2(e.getMessage(), e);
        }
    }

}