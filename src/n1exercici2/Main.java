/*** S1.6 Nivell 1 exercici 2 ***/
package n1exercici2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Toni", "Llombart", 39);
        String s = "Hola";
        Integer i = 9;
        GenericMethods.genericMethod(persona,s,i);  //We don't care about the order in which we pass parameters
        System.out.println();
        GenericMethods.genericMethod(i,persona,s);
        System.out.println();
        GenericMethods.genericMethod(s,i,persona);

    }


}
