public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Double contaBancaria;

    public Pessoa(String nome, String nacionalidade, Integer idade, Double contaBancaria) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.contaBancaria = contaBancaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(Double contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public int compareTo(Pessoa other) {
        return this.idade - other.idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                ", contaBancaria=" + contaBancaria +
                '}';
    }
}
