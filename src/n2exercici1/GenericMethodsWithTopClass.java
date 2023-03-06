/*** S1.6 Nivell 2 exercici 1 ***/

package n2exercici1;

import n1exercici1.PersonaDeProva;

public class GenericMethodsWithTopClass {
    static <T,U> void genericMethod(T firstParameter, U secondParameter, PersonaDeProva persona ) {  //Method with two generic parameters: T, U and a Persona parameter
        System.out.println(firstParameter);
        System.out.println(secondParameter);
        System.out.println(persona);
    }
}
