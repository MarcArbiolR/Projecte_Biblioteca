package Projecte_Biblioteca;

import java.time.LocalDate;

public class Prestec {
    private static final int MAX_LLIBRES_PER_USUARI = 3;

    private Usuari usuari;
    private Llibre llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;

    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        if (usuari.getLlibresPrestats().size() >= MAX_LLIBRES_PER_USUARI) {
            throw new IllegalArgumentException("L'usuari ja ha arribat al límit de llibres en préstec.");
        }

        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataPrestec.plusWeeks(2);

        // Afegim el llibre a la llista de llibres prestats de l'usuari
        usuari.prestarLlibre(llibre);
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public Llibre getLlibre() {
        return llibre;
    }

    public LocalDate getDataPrestec() {
        return dataPrestec;
    }

    public LocalDate getDataRetorn() {
        return dataRetorn;
    }

    @Override
    public String toString() {
        return "Préstec | Usuari: " + usuari.getNom() +
               ", Llibre: " + llibre.getTitol() +
               ", Data: " + dataPrestec +
               ", Retorn: " + dataRetorn;
    }
}
