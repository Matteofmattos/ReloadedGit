package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Testes {

    public static void main(String[] args) {

        System.out.println("*** Filter 1");

        Stream<String> nomes = Stream.of("Matheus", "Felipe", "Oliveira", "Mattos");

        Stream<String> m1 = nomes.filter(n -> {
            return n.startsWith("M");
         });

        m1.forEach(System.out::println);

        System.out.println("\n*** Filter 2");

        List<Person> pessoas = new Person().popular();
        Stream<Person> streamP = pessoas.stream();

        Stream<Person> brasileiros = streamP.filter(person -> {
            return person.getNacionality().equals("Brasileiro.");
        });

        brasileiros.forEach(System.out::println);

        System.out.println("\n*** Map ");
        IntStream intStream = pessoas.stream().mapToInt(person -> {
            return (person.getAge() + 2);
        });

        intStream.forEach(System.out::println);

        System.out.println("\n*** Sorted ");

        Stream<Person> sortedAge = pessoas.stream().sorted(Comparator.comparing(Person::getAge));
        sortedAge.forEach(System.out::println);

        System.out.println("\n*** Distinct ");

        pessoas.stream().distinct().forEach(System.out::println);

        System.out.println("\n*** Count ");

        long quantidade = pessoas.stream().filter(person -> {
            return person.getNacionality().equals("Brasileiro.");
        }).count();

        System.out.println(quantidade);

        System.out.println("\n*** AllMatch ");

        boolean maioridade = pessoas.stream().allMatch(person -> {
            return person.getAge() > 18;
        });
        System.out.println(maioridade);

        System.out.println("\n*** Collections ");
        List<Person> naoBrasileiros = pessoas.stream().filter(person -> {
            return
                    !person.getNacionality().equals("Brasileiro.");
        }).collect(Collectors.toList());

        naoBrasileiros.forEach(person -> {
            System.out.println(person.getNacionality());
        } );

        ArrayList<Person> above20y = pessoas.stream().filter(person -> {
            return person.getAge() > 40;
        }).collect(toCollection(ArrayList::new));

        System.out.println("\n");
        above20y.forEach(person -> {
            System.out.println(person.getAge());
        });

        Map<Integer, String> map = pessoas.stream().filter(s -> {
            return s.getAge() < 30;
        }).collect(toMap(Person::getCpf, Person::toString));

        System.out.println("\n");

        for (Map.Entry<Integer,String> entry : map.entrySet())
            System.out.println("Key:  " + entry.getKey() + ", Value:  " + entry.getValue());

        System.out.println("\n");
        map.forEach((k,v)-> System.out.println(k +":  "+ v ));

        Map<String, List<Person>> groupbyAge = pessoas.stream().distinct()
                .collect(groupingBy(Person::getNacionality));

        System.out.println("\n");
        groupbyAge.forEach((k,v)-> System.out.println(k +":  "+ v ));


        System.out.println("\n** Optionais");

        Optional<Person> max =  pessoas.stream().max(Comparator.comparing(Person::getAge));
        max.ifPresent(System.out::println);
    }
}
