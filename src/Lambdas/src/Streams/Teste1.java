package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Teste1 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().retornaPessoas();

        System.out.println("------------*** Filter ***----------");
        Stream<Pessoa> mulheres = pessoas.stream().filter(pessoa -> {
            return pessoa.getSexo().equals('F');
        });

        mulheres.forEach(System.out::println);
        System.out.println("------------*** Double Filter ***----------");
        Stream<String> mulheres2 = pessoas.stream().filter(pessoa -> {
            return pessoa.getSexo().equals('F') && pessoa.getIdade()>30;
        }).map(Pessoa::getNome);
        mulheres2.forEach(System.out::println);

        System.out.println("------------*** MapInt ***----------");
        IntStream idade_acima30 = pessoas.stream().mapToInt(Pessoa::getIdade);
        idade_acima30.forEach(System.out::println);


        System.out.println("------------*** Map ***----------");
        Stream<String> nomesMasculinos = pessoas.stream().filter(s -> {
            return s.getSexo().equals('M');
        }).map(Pessoa::getNome);
        nomesMasculinos.forEach(System.out::println);

        System.out.println("------------*** Sorted ***----------\n");
        Stream<Pessoa> sorted = pessoas.stream().sorted(Comparator.comparing(Pessoa::getIdade));
        sorted.forEach(System.out::println);

        System.out.println("------------*** inverted Sorted***----------\n");
        Stream<Pessoa> sorted1 = pessoas.stream().sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
        sorted1.forEach(System.out::println);

        System.out.println("------------*** Distinct ( requer equals e hashcode )***----------\n");
        Stream<Pessoa> distinct = pessoas.stream().distinct();
        distinct.forEach(System.out::println);

        System.out.println("------------*** Count ***----------\n");
        long count = pessoas.stream().filter(s -> s.getNome().startsWith("M")).count();
        System.out.println(count);

        System.out.println("------------*** AllMatch ***----------\n");
        boolean maioridade = pessoas.stream().allMatch(s -> {
            return s.getIdade()>18;
        });
        System.out.println(maioridade);

        System.out.println("------------*** Collects to List ***----------\n");
        List<Pessoa> lista = pessoas.stream().filter(pessoa -> {
            return pessoa.getSexo().equals('M');
        }).collect(Collectors.toList());
        lista.forEach(System.out::println);

        System.out.println("------------*** Collects to Arraylist ***----------\n");
        List<Pessoa> listaP = pessoas.stream().filter(pessoa -> {
            return pessoa.getSexo().equals('M');
        }).collect(Collectors.toCollection(ArrayList::new));

        listaP.forEach(System.out::println);

        System.out.println("------------*** Collects to map ***----------\n");
        Map<String, String> pessoasMap = pessoas.stream().filter(pessoa -> {
            return pessoa.getSexo().equals('M');
        }).collect(Collectors.toMap(Pessoa::getId, Pessoa::getNome));

        System.out.println(pessoasMap);
        pessoasMap.forEach((key, value) -> {
            System.out.println("key: " + key + ", value: " + value);
        });

        System.out.println("------------*** Groupby ***----------\n");
        Map<String, List<Pessoa>> agrupaIdade = pessoas.stream().filter(pessoa -> {
            return pessoa.getSexo().equals('M');
        }).collect(Collectors.groupingBy(Pessoa::getNacionalidade));

        agrupaIdade.forEach((key, value) -> {
            System.out.println("Grupo: " + key + ", Dados : " + value.toString());
        });
    }
}
