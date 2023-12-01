public class Czytelnik extends Uzytkownik {
    private final int numerKartyCzytelnika;
    private int liczbaPozyczonychKsiazek;
    private boolean zablokowany;
    private Adres adres;
    public Czytelnik(String nickname,
                     String tajneHaslo,
                     String adresMail, int numerKartyCzytelnika,
                     int liczbaPozyczonychKsiazek,
                     Adres adres, boolean zablokowany) {
        super(nickname, tajneHaslo, adresMail);
        this.numerKartyCzytelnika = numerKartyCzytelnika;
        this.liczbaPozyczonychKsiazek = liczbaPozyczonychKsiazek;
        this.adres = adres;
        this.zablokowany = zablokowany;
    }
    public void pokaz() {
        super.pokaz();
        System.out.println("# -- Czytelnik -- #");
        System.out.println("1. Numer karty czytelnika: " + getNumerKartyCzytelnika());
        System.out.println("2. Liczba pozyczonych ksiazek: " + getLiczbaPozyczonychKsiazek());
        System.out.println("3. Zablokowane konto: " + isZablokowany());
        System.out.println("4. Adres: ");
        System.out.println("4.1. Nazwa adresu: " + adres.getNazwa());
        System.out.println("4.2. Kraj: " + adres.getKraj());
        System.out.println("4.3. Województwo: " + adres.getWojewodztwo());
        System.out.println("4.4. Miasto: " + adres.getMiasto());
        System.out.println("4.5. Kod pocztowy: " + adres.getKodPocztowy());
        System.out.println("4.6. Ulica1: " + adres.getUlica1());
        if(!adres.getUlica2().isEmpty())
            System.out.println("4.7. Ulica2: " + adres.getUlica2());
        System.out.println("# -------------- #");
    }
    public int getNumerKartyCzytelnika() {
        return numerKartyCzytelnika;
    }

    public int getLiczbaPozyczonychKsiazek() {
        return liczbaPozyczonychKsiazek;
    }

    public void setZablokowany(boolean zablokowany) {
        this.zablokowany = zablokowany;
    }

    public boolean isZablokowany() {
        return zablokowany;
    }
}
