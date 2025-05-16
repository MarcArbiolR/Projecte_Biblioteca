import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // --- ATRIBUTS ---
    private List<Llibre> llibres;

    // Constructor per la biblioteca
    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    // ---- MÈTODES ----
    // Mètode per afegir un llibre
    public void afegirLlibre(Llibre llibre) { 
        llibres.add(llibre); 
    }

    // Mètode per buscar un llibre a través del títol
    public Llibre buscarLlibre(String titol) {
        for (Llibre llibre : llibres) {
            if (llibre.getTitol().equalsIgnoreCase(titol)) {
            return llibre;
            }
        }
        return null;
    }

    // Mètode per llistar llibres
    public List<Llibre> getLlibres() { 
        return llibres; 
    }

}