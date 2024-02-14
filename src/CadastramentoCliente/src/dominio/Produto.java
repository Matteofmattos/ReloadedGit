package dominio;

import generics.Persistence;

import java.util.Objects;

public class Produto implements Persistence {
    private String nome;
    private String codigo;

    public Produto(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public Produto setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Codigo: " + codigo;
    }

}
