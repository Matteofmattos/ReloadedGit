package TesteGenericsSimples3;

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorroAnimal = new Cachorro();

        Class classe = cachorroAnimal.getClasse();

        Class<Cachorro> classe2 = cachorroAnimal.getClasse2();

    }
}
