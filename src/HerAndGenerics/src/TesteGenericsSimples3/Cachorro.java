package TesteGenericsSimples3;

public class Cachorro extends Animal<Cachorro> {
    @Override
    protected Class getClasse() {
        return Gato.class; // Pode-se devolver QUALQUER classe;
    }

    @Override
    protected Class<Cachorro> getClasse2() { // Não se pode passar outro parâmetro a não ser cachorro, pois
        // já foi alocado na classe abstrata o tipo cachorro para o T;
        return Cachorro.class;
    }
}
