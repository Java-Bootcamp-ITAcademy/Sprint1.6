/*** S1.6 Nivell 2 exercici 2 ***/

package n2exercici2;

import n1exercici1.PersonaDeProva;

public class GenericMethodsWithVarargs {
    public static<T> void genericMethodsWithVarargs(PersonaDeProva persona, T...varargs) {  //Using varargs. Must be the last parameter.
        System.out.println(persona);
        for(T arg:varargs) {
            System.out.println(arg);
        }
    }
}
