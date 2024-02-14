package ExemploAnimalHerança;

public class Cachorro extends Animal{

    public Cachorro(java.lang.String origem, java.lang.String porte, Boolean carnovoro, Boolean mamifero) {
        super(origem, porte, carnovoro, mamifero);
    }

    @Override
    protected void comer() {
        System.out.println("Comendo...");
    }

    @Override
    protected void beber() {
        System.out.println("Bebendo...");
    }

    @Override
    protected void movimentar() {
        System.out.println("Se movimentando...");
    }
}
