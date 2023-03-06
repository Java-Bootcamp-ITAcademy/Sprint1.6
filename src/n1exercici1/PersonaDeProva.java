package n1exercici1;

public class PersonaDeProva {
    private String name;
    private String surname;
    private int edat;

    public PersonaDeProva(String name, String surname, int edat) {
        this.name = name;
        this.surname = surname;
        this.edat = edat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "PersonaDeProva{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
