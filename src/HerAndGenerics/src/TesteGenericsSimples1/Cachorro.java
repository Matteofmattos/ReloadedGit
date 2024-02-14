package TesteGenericsSimples1;

import TesteGenericsSimples2.Animal;

public class Cachorro<T>  extends Animal<T> {
    public Cachorro(String origem, String porte, Boolean carnovoro, Boolean mamifero) {
        super(origem, porte, carnovoro, mamifero);
    }

    @Override
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
