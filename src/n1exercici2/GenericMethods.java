/*** S1.6 Nivell 1 exercici 2 ***/

package n1exercici2;

public class GenericMethods {
    static <T,U,V> void genericMethod(T firstParameter, U secondParameter, V thirdParameter ) {  //Method with three generic parameters: T, U, V
        System.out.println(firstParameter);
        System.out.println(secondParameter);
        System.out.println(thirdParameter);
    }
}
