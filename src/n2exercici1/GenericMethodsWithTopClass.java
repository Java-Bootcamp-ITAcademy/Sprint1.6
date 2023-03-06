/*** S1.6 Nivell 2 exercici 1 ***/

package n2exercici1;

public class GenericMethodsWithTopClass {
    static <T,U> void genericMethod(T firstParameter, U secondParameter, PersonaNova persona ) {  //Method with two generic parameters: T, U and a Persona parameter
        System.out.println(firstParameter);
        System.out.println(secondParameter);
        System.out.println(persona);
    }
}
