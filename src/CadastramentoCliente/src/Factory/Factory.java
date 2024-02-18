package Factory;

public class Factory implements IFactory {
    @Override
    public PersistenteFactory createFactory(String opcaoMenuGeral) {
        return switch (opcaoMenuGeral) {
            case "1" -> new ProductoFactory();
            case "2" -> new ClienteFactory();
            default -> null;
        };
    }
}
