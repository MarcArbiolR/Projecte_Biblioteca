import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {
    /* --- ATRIBUTS DE LA CLASSE --- */
    // List<Prestec> prestecs: conté la llista de préstecs realitzats
    private List<Prestec> prestecs;

    /* --- CONSTRUCTOR DE LA CLASSE --- */
    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    /* --- MÈTODES DE LA CLASSE --- */
    // Mètode que afegeix un llibre a la llista de préstecs realitzats
    public void prestarLlibre(Usuari usuari, Llibre llibre) {
        if (!llibre.esPrestat()) {
            llibre.prestar();
            Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());
            prestecs.add(prestec);
            usuari.afegirLlibre(llibre);
            System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());
        } else {
            System.out.println("Aquest llibre ja està prestat.");
        }
    }
}