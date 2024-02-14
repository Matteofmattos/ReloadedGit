package TesteGenericsSimples1;

public class ClasseGenerica<T> {
    public T metodoGenerico(T value){
        return value;
    }

    public  Class<T> metodoGenerico1(){
        return (Class<T>) ClasseGenerica.class;
    }

    public  Class metodoGenerico2(){
        return this.getClass();
    }

    public  Class<Cachorro> metodoGenerico3(){ // O valor generico T foi previamente definido em escopo.
        return Cachorro.class;
    }

}
