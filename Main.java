public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Llibre llibre1 = new Llibre("1984", "George Orwell");
        Llibre llibre2 = new Llibre("El petit príncep", "Antoine de Saint-Exupéry");
        biblioteca.afegirLlibre(llibre1);
        biblioteca.afegirLlibre(llibre2);

        Usuari usuari = new Usuari("Carla");
        GestorBiblioteca gestor = new GestorBiblioteca();
        // Mostrar catàleg de llibres
        System.out.println("Catàleg de llibres:");
        for (Llibre l : biblioteca.getLlibres()) {
            System.out.println(l);
        }

        // Fer un préstec
        System.out.println("\nIntentant prestar '1984' a Carla...");
        gestor.prestarLlibre(usuari, llibre1);

        // Mostrar llibres prestats per l'usuari
        System.out.println("\nLlibres prestats per Carla:");
        usuari.mostrarLlibresPrestats();
    }
}