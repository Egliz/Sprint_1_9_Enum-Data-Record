package level_3.ex1_record;

public record Person(String name, int age) {

    //ex3_constructor
    public Person {
        if(age < 0) {
            throw new IllegalArgumentException("Enter a valid age.");
        }
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Enter a valid name.");
        }
    }
    //ex2_methods
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


/*
Afegeix mètodes personalitzats dins d’un record.
Crea un record amb validació en el constructor (ex: edat no pot ser negativa).
Crea una llista de Person i filtra-la amb lambdas i streams (ex: mostrar només els majors d’edat).
Compara un record amb una classe tradicional i comenta les diferències en llegibilitat i utilitat.
 */