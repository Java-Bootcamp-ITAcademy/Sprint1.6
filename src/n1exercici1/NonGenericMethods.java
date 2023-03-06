/*** S1.6 Nivell 1 exercici 1 ***/
package n1exercici1;

import java.util.Set;
import java.util.TreeSet;

public class NonGenericMethods<T> {  //Declaring class with generic T
    private T t1;
    private T t2;
    private T t3;
    public NonGenericMethods(T first, T second, T third) {  //Constructor
        this.t1=first;
        this.t2=second;
        this.t3=third;
    }

    public T getT1() {
        return t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }

    public T getT2() {
        return t2;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }

    public T getT3() {
        return t3;
    }

    public void setT3(T t3) {
        this.t3 = t3;
    }
}
