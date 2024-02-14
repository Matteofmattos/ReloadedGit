package Exceptions;

public class ClienteDao{

    public static void consultarCliente() throws ClientNotFoundException{

        throw new ClientNotFoundException("Cliente não encontrado!");

    }

}