package Optionals;

import Streams.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Teste {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().retornaPessoas();

       Optional<Pessoa> maxAgeOp = pessoas.stream().max(Comparator.comparing(Pessoa::getIdade));
        maxAgeOp.ifPresent(System.out::println);
    }
}
