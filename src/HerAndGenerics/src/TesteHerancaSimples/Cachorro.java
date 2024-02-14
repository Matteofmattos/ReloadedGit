package TesteHerancaSimples;

public class Cachorro extends Animal {

    public Cachorro(String origem, String porte, Boolean carnovoro, Boolean mamifero) {
        super(origem, porte, carnovoro, mamifero);
    }

    @Override   // este método vem da interface que o classe abstrata pai implementou.
    public void comer() {

    }

    @Override
    public void beber() {

    }

    @Override
    public void movimentar() {

    }

    @Override
    public void emitirSom() {

    }
}
