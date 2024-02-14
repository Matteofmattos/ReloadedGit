public interface IGato {

    public String cadastrar(Gato gato);
    public String consultar(String nome);
    public String remover(String nome);
    public String alterar(String nome, String raca);
}
