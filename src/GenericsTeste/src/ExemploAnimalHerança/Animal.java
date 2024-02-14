package ExemploAnimalHerança;

public abstract class Animal {
    protected String origem;
    protected String porte;
    protected Boolean carnovoro;
    protected Boolean mamifero;

    public Animal(java.lang.String origem, java.lang.String porte, Boolean carnovoro, Boolean mamifero) {
        this.origem = origem;
        this.porte = porte;
        this.carnovoro = carnovoro;
        this.mamifero = mamifero;
    }

    protected abstract void comer();
    protected abstract void beber();
    protected abstract void movimentar();

}
