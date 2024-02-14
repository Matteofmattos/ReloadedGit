import java.util.Objects;

public class Cachorro {

    private String nome;
    private String raca;

    public Cachorro(String nome, String raca){
        this.nome=nome;
        this.raca=raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cachorro cachorro = (Cachorro) o;
        return Objects.equals(nome, cachorro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Nome do doguinho: " + this.nome + ", raca: " + this.raca;
    }
}
