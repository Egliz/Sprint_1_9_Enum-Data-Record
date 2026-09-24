package level_3.ex1_record;

public record Person(String name, int age) {

    public String fullName(String surname) {
        return "My full name is " name + surname;
    }
}


/*
Afegeix mètodes personalitzats dins d’un record.
Crea un record amb validació en el constructor (ex: edat no pot ser negativa).
Crea una llista de Person i filtra-la amb lambdas i streams (ex: mostrar només els majors d’edat).
Compara un record amb una classe tradicional i comenta les diferències en llegibilitat i utilitat.
 */