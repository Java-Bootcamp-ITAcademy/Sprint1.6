/*** S1.6 Nivell 2 exercici 2 ***/
package n2exercici2;

import n1exercici1.PersonaDeProva;


public class Main {
    public static void main(String[] args) {
        PersonaDeProva persona=new PersonaDeProva("Toni","Llombart",39);
        String s="Hola";
        Integer i=9;

        GenericMethodsWithVarargs.genericMethodsWithVarargs(persona);//Calling method in several ways
        System.out.println();
        GenericMethodsWithVarargs.genericMethodsWithVarargs(persona,persona);
        System.out.println();
        GenericMethodsWithVarargs.genericMethodsWithVarargs(persona,s,s,i);
    }
}
