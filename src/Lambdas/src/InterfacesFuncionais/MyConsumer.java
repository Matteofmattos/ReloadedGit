package InterfacesFuncionais;
@FunctionalInterface
public interface MyConsumer<T> {
    public abstract void accept(T value);
}
