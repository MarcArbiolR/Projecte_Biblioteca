public class Llibre {
    /* --- ATRIBUTS DE LA CLASSE --- */
    // String titol: conté el títol del llibre
    private String titol;
    // String autor: conté el nom de l'autor del llibre
    private String autor;
    // boolean prestat: indica si el llibre està prestat o no
    private boolean prestat;

    /* --- CONSTRUCTORS --- */
    // Constructor per defecte
    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    /* --- MÈTODES AUXILIARS DE LA CLASSE--- */
    // Retorna el títol del llibre
    public String getTitol() {
        return titol;
    }

    // Retorna l'autor del llibre
    public String getAutor() {
        return autor;
    }

    // Retorna si el llibre està prestat o no
    public boolean esPrestat() {
        return prestat;
    }
    // Métode que fa que el llibre estigui prestat.
    public void prestar() {
        prestat = true;
    }
    // Métode que fa que el llibre no estigui prestat.
    public void retornar() {
        prestat = false;
    }
}
