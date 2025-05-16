package Projecte_Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuari {
    private String nom;
    private List<Llibre> llibresPrestats;

    public Usuari(String nom) {
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Usuari: " + nom + " | Llibres en préstec: " + llibresPrestats.size();
    }
}
