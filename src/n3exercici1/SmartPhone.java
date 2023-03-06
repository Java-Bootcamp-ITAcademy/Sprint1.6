package n3exercici1;

public class SmartPhone implements Telefon{

    /* No constructor is defined, so we are ok with default constructor */

    /* Instance method */
    public void ferFotos() {
        System.out.println("Estem fent fotos");
    }

    /* Implementing inherited abstract methods */
    @Override
    public void trucar() {
        System.out.println("Estem trucant des de "+getClass().getSimpleName());
    }
}
