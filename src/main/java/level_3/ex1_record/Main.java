package level_3.ex1_record;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Ana", 56);
        Person person2 = new Person("Maria", 5);
        Person person3 = new Person("Brad", 17);
        Person person4 = new Person("Cristiano", 8);
        Person person5 = new Person("Juan", 26);

        List<Person> people = List.of(person1, person2, person3, person4, person5);
        System.out.println(filterPeople(people));


        //Crea una llista de Person i filtra-la amb lambdas i streams (ex: mostrar només els majors d’edat).

    }

    public static List<Person> filterPeople(List<Person> people){
        return people.stream().filter(person -> person.legalAge())
                .collect(Collectors.toList());
    }
}