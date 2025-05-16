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

    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    public boolean prestarLlibre(Llibre llibre) {
        if (llibresPrestats.contains(llibre)) {
            System.out.println("Aquest llibre ja està en préstec per aquest usuari.");
            return false;
        }
        llibresPrestats.add(llibre);
        System.out.println("Llibre prestat a " + nom + ": " + llibre.getTitol());
        return true;
    }

    public boolean retornarLlibre(Llibre llibre) {
        if (llibresPrestats.remove(llibre)) {
            System.out.println("Llibre retornat per " + nom + ": " + llibre.getTitol());
            return true;
        } else {
            System.out.println("Aquest llibre no estava en préstec per aquest usuari.");
            return false;
        }
    }

    public void mostrarLlibresPrestats() {
        System.out.println("Llibres en préstec per " + nom + ":");
        if (llibresPrestats.isEmpty()) {
            System.out.println("Cap llibre.");
        } else {
            for (Llibre l : llibresPrestats) {
                System.out.println("- " + l.getTitol());
            }
        }
    }

    @Override
    public String toString() {
        return "Usuari: " + nom + " | Llibres en préstec: " + llibresPrestats.size();
    }
}
