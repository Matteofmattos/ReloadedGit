package Dao;

import dominio.Produto;
import generics.GenericDao;

public class ProdutosDao extends GenericDao<Produto> implements IProdutoDao{
    public ProdutosDao() {
        super();
    }

    @Override
    public Class<Produto> getClasse() {
        return Produto.class;
    }

    @Override
    public void alterar(Produto entity, Produto dado) {
        dado.setNome(entity.getNome());
        dado.setCodigo(entity.getCodigo());
        System.out.println("Dados atualizados...");
    }
}
