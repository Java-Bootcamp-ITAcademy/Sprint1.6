/*** S1.6 Nivell 2 exercici 2 ***/
package n2exercici2;

public class PersonaUltima {
    private String nom;
    private String cognom;
    private int edat;

    public PersonaUltima(String nom, String cognom, int edat) {  //Constructor
        setNom(nom);
        setCongnom(cognom);
        setEdat(edat);
    }

    public String getNom() {  //Getters and setters
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCongnom() {
        return cognom;
    }

    public void setCongnom(String congnom) {
        this.cognom = congnom;
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
