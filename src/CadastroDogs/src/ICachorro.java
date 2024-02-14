public interface ICachorro {
    public String cadastrar(Cachorro cachorro);
    public String consultar(String nome);
    public String remover(String nome);
    public String alterar(String nome, String raca);
}
