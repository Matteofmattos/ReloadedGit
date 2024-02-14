package generics;

public interface IGenericDao<T extends Persistence> {
    public void cadastrar(T entity);
    public void consultar(String codigo);
    public void excluir(String codigo);
    public void atualizar(T entity);
}
