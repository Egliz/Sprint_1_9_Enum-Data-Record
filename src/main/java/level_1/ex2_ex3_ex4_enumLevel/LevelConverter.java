package level_1.ex2_ex3_ex4_enumLevel;
//Ex4
public class LevelConverter {

    public static Level stringToEnum(String value) {
         return Level.valueOf(value);
            //TODO no poner que retorne null porque entonces quien lo recibe tendria que verificar
            // que no sea nulo.
        }
    }
