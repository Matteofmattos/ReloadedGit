package Factory;

import dominio.Cliente;
import generics.Persistence;

public class ClienteFactory implements PersistenteFactory {
    @Override
    public Persistence criaObjeto(String nome, String codigo) {
        return new Cliente(nome,codigo);
    }
}
