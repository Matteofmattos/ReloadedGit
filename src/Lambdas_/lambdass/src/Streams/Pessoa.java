package Streams;

import java.util.List;
import java.util.Objects;

public class Pessoa {

    private String id;
    private String nome;
    private String nacionalidade;
    private Character sexo;
    private Integer idade;
    public Pessoa() { }
    public Pessoa(String id, String nome, String nacionalidade, Character sexo, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "id: " + id +
                ", nome: " + nome +
                ", nacionalidade: '" + nacionalidade +
                ", sexo: " + sexo +
                ", idade: " + idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public List<Pessoa> retornaPessoas(){
        Pessoa p1 = new Pessoa("7367236","Matheus Felipe","Brasileiro",'M',21);
        Pessoa p2 = new Pessoa("7862615","João Braga","Português",'M',34);
        Pessoa p3 = new Pessoa("4313262","Antônio Sanchez","Argentino",'M',48);
        Pessoa p4 = new Pessoa("5434244","Erika Zocher","Alemã",'F',22);
        Pessoa p5 = new Pessoa("9834426","Augusta Martelo","Italiana",'F',28);
        Pessoa p6 = new Pessoa("8362766","Augusta Martelo","Italiana",'F',36);
        Pessoa p7 = new Pessoa("9183771","Matheus Felipe","Português",'M',28);
        Pessoa p8 = new Pessoa("0988161","Mika Thompson","Australiano",'M',31);
        return List.of(p1,p2,p3,p4,p5,p6,p7,p8);
    }
}
