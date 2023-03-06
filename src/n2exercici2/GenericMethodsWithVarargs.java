/*** S1.6 Nivell 2 exercici 2 ***/

package n2exercici2;

public class GenericMethodsWithVarargs {
    public static<T> void genericMethodsWithVarargs(PersonaUltima persona, T...varargs) {  //Using varargs. Must be the last parameter.
        System.out.println(persona);
        for(T arg:varargs) {
            System.out.println(arg);
        }
    }
}
