package n3exercici1;

public class Generica {

    /* No constructor is defined, so we are ok with default constructor */

    /* Generic methods */
    public <T extends Telefon> void metodeGenericTelefon (T t) {  //Can't implement ferFotos since is a superclass of SmartPhone
        t.trucar();
    }

    public <T extends SmartPhone> void metodeGenericSmartPhone (T t) {  //Can implement both ferFotos and trucar
        t.trucar();
        t.ferFotos();
    }
}
