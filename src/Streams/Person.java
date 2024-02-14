package Streams;

import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String nacionality;
    private Integer cpf;

    public Person(String name, int age, String nacionality, Integer cpf) {
        this.name = name;
        this.age = age;
        this.nacionality = nacionality;
        this.cpf = cpf;
    }

    public Person() {
    }

    public Integer getCpf() {
        return cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNacionality() {
        return nacionality;
    }

    public List<Person> popular(){
        Person p1 = new Person("Matheus Felipe",28,"Brasileiro.",7774);
        Person p2 = new Person("Augusto Braga",40,"Português.",1121);
        Person p3 = new Person("Hanz Merkel",29,"Alemão.",54545);
        Person p4 = new Person("Ibraimovic stuzt",22,"Sueco.",2134);
        Person p5 = new Person("Jéssica Alves",38,"Brasileiro.",21874);
        Person p6 = new Person("Diocesar Sanachez",58,"Argentino.",8748);
        Person p7 = new Person("Matheus Felipe",26,"Brasileiro.",54871);
        return List.of(p1,p2,p3,p4,p5,p6,p7);
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(cpf, person.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "name: '" + name +
                ", age: " + age;
    }
}
