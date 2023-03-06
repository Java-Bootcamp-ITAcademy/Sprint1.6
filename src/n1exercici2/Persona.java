/*** S1.6 Nivell 1 exercici 2 ***/
package n1exercici2;

public class Persona {
    private String nom;
    private String congnom;
    private int edat;

    public Persona(String nom, String congnom, int edat) {  //Constructor
        setNom(nom);
        setCongnom(congnom);
        setEdat(edat);
    }

    public String getNom() {  //Getters and setters
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCongnom() {
        return congnom;
    }

    public void setCongnom(String congnom) {
        this.congnom = congnom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {  //Overriding toString method
        return "Nom: "+getNom()+" | Cognom: "+getCongnom()+" | Edat: "+getEdat();
    }
}
