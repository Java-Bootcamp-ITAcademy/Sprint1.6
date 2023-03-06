/*** S1.6 Nivell 2 exercici 2 ***/
package n2exercici2;


public class Main {
    public static void main(String[] args) {
        PersonaUltima personaUltima=new PersonaUltima("Toni","Llombart",39);
        String s="Hola";
        Integer i=9;

        GenericMethodsWithVarargs.genericMethodsWithVarargs(personaUltima);//Calling method in several ways
        System.out.println();
        GenericMethodsWithVarargs.genericMethodsWithVarargs(personaUltima,personaUltima);
        System.out.println();
        GenericMethodsWithVarargs.genericMethodsWithVarargs(personaUltima,s,s,i);
    }
}
