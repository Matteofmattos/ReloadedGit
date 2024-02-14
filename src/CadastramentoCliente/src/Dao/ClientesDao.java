package Dao;

import dominio.Cliente;
import generics.GenericDao;

import java.util.HashMap;
import java.util.Map;

public class ClientesDao extends GenericDao<Cliente> implements IClienteDao{
    public ClientesDao() {
        super();
    }
    @Override
    public Class<Cliente> getClasse() {
        return Cliente.class;
    }

    @Override
    public void alterar(Cliente entity, Cliente dado) {
            dado.setNome(entity.getNome());
            dado.setCpf(entity.getCpf());
            System.out.println("Dados atualizados...");
        }
}
