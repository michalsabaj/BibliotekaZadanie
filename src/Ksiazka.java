public class Ksiazka {
    private String tytul;
    private String isbn;
    private boolean wypozyczona;
    private Biblioteka biblioteka;
    private Czytelnik czytelnik;

    public Ksiazka(String tytul, String isbn, boolean wypozyczona,
                   Biblioteka biblioteka,
                   Czytelnik czytelnik) {
        this.tytul = tytul;
        this.isbn = isbn;
        this.wypozyczona = wypozyczona;
        this.biblioteka = biblioteka;
        this.czytelnik = czytelnik;
    }

    public void pokaz() {
        System.out.println("# -- Książka -- #");
        System.out.println("# Tytuł: " + getTytul());
        System.out.println("# ISBN: " + getIsbn());
        System.out.println("# Wypozyczona: " + isWypozyczona());
        biblioteka.pokaz();
        if(isWypozyczona()) {
            czytelnik.pokaz();
        }
        System.out.println("# --------- #");
    }

    public String getTytul() {
        return tytul;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isWypozyczona() {
        return wypozyczona;
    }

    public Czytelnik getCzytelnik() {
        return czytelnik;
    }
}
