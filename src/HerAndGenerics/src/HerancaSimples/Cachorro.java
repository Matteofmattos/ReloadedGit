package HerancaSimples;

public class Cachorro extends Animal {

    public Cachorro(String origem, String porte, Boolean carnovoro, Boolean mamifero) {
        super(origem, porte, carnovoro, mamifero);
    }

    @Override
    public void beber() {
        System.out.println("bebendo...");
    }

    @Override
    public void comer() {
        System.out.println("Comendo...");
    }

    @Override
    public void emitirSom() {
    }

    @Override
    public void movimentar() {

    }
}
