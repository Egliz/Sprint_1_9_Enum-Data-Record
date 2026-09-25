package level_3.ex1_record;

//ex1_createARecord
public record Person(String name, int age) {

    //ex3_validationInContructor
    public Person {
        if(age < 0) {
            throw new IllegalArgumentException("Enter a valid age.");
        }
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Enter a valid name.");
        }
    }
    //ex2_customisedMethods
    public String fullName(String surname) {
        return "My full name is " + name + " " + surname;
    }

    public boolean legalAge(){
        return (age >= 18);
    }

    public String lengthName(){
        if(name.length() <= 5){
            return "Your name isn't long.";
        } else {
            return "Your name is too long";
        }
    }
}