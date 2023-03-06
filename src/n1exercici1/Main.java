/*** S1.6 Nivell 1 exercici 1 ***/
package n1exercici1;

public class Main {
    public static void main(String[] args) {
        NonGenericMethods<String> nonGenericMethods1=new NonGenericMethods<>("Toni","Laura","Jordi");
        NonGenericMethods<String> nonGenericMethods2=new NonGenericMethods<>("Laura","Jordi","Toni");
        System.out.println(nonGenericMethods1.getT1()+" "+nonGenericMethods1.getT2()+" "+nonGenericMethods1.getT3());
        System.out.println(nonGenericMethods2.getT1()+" "+nonGenericMethods2.getT2()+" "+nonGenericMethods2.getT3());

        PersonaDeProva p1=new PersonaDeProva("Toni","Llombart",39);
        PersonaDeProva p2=new PersonaDeProva("Laura","Àger",35);
        PersonaDeProva p3=new PersonaDeProva("Jordi","Mateu",44);
        NonGenericMethods<PersonaDeProva> nonGenericMethods3= new NonGenericMethods<>(p1,p2,p3);
        NonGenericMethods<PersonaDeProva> nonGenericMethods4= new NonGenericMethods<>(p2,p3,p1);
        System.out.println(nonGenericMethods3.getT1()+" "+nonGenericMethods3.getT2()+" "+nonGenericMethods3.getT3());
        System.out.println(nonGenericMethods4.getT1()+" "+nonGenericMethods4.getT2()+" "+nonGenericMethods4.getT3());
    }
}