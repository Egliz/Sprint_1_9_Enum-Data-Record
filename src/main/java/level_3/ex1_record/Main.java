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

        System.out.println(person1.fullName("Lopez"));
        System.out.println(person1.name()+ ", " + person1.lengthName());

        List<Person> people = List.of(person1, person2, person3, person4, person5);
        System.out.println(filterPeople(people));
    }
    //ex4_filterWithLambdasAndStreams
    public static List<Person> filterPeople(List<Person> people){
        return people.stream().filter(person -> person.legalAge())
                .collect(Collectors.toList());
    }
}