package n3exercici1;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone();
        Telefon telefon=(Telefon)smartPhone;

        Generica generica=new Generica();
        generica.metodeGenericTelefon(telefon);
        generica.metodeGenericTelefon(smartPhone);
        generica.metodeGenericSmartPhone(smartPhone);
    }
}
