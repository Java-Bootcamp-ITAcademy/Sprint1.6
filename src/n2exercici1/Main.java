/*** S1.6 Nivell 2 exercici 1 ***/
package n2exercici1;

import n1exercici2.GenericMethods;
import n1exercici2.Persona;

public class Main {
    public static void main(String[] args) {
        PersonaNova persona=new PersonaNova("Toni","Llombart",39);
        String s="hola";
        Integer i=9;
        GenericMethodsWithTopClass.genericMethod(s,i,persona);
        System.out.println();
        GenericMethodsWithTopClass.genericMethod(i,s,persona);
        System.out.println();
        GenericMethodsWithTopClass.genericMethod(s,s,persona);
        System.out.println();
    }
}
