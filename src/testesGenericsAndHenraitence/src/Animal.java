public abstract class Animal {
    protected String origem;
    protected String porte;
    protected Boolean carnovoro;
    protected Boolean mamifero;
    
    public Animal(String origem, String porte, Boolean carnovoro, Boolean mamifero) {
        this.origem = origem;
        this.porte = porte;
        this.carnovoro = carnovoro;
        this.mamifero = mamifero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Boolean getCarnovoro() {
        return carnovoro;
    }

    public void setCarnovoro(Boolean carnovoro) {
        this.carnovoro = carnovoro;
    }

    public Boolean getMamifero() {
        return mamifero;
    }

    public void setMamifero(Boolean mamifero) {
        this.mamifero = mamifero;
    }

    public abstract void comer();
    public abstract void beber();
    public abstract void emitirSom();
    public abstract void movimentar();

    @Override
    public String toString() {
        return "Origem:" + origem + ", porte: " + porte + ", carnovoro: " + carnovoro + ", mamifero: " + mamifero;
    }
    
}
