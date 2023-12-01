public class Biblioteka {
    private final String nazwa;
    private int liczbaKsiazek;
    private int liczbaPozyczonychKsiazek;
    private int liczbaCzytelnikow;
    private String godzinyOtwarcia;
    private String numerTelefonu;
    private Adres adres;

    public Biblioteka(String nazwa, int liczbaKsiazek, int liczbaPozyczonychKsiazek, int liczbaCzytelnikow,
                      String godzinyOtwarcia,
                      String numerTelefonu,
                      Adres adres) {
        this.nazwa = nazwa;
        this.liczbaKsiazek = liczbaKsiazek;
        this.liczbaPozyczonychKsiazek = liczbaPozyczonychKsiazek;
        this.liczbaCzytelnikow = liczbaCzytelnikow;
        this.godzinyOtwarcia = godzinyOtwarcia;
        this.numerTelefonu = numerTelefonu;
        this.adres = adres;
    }

    public void pokaz(){
        System.out.println("#-----------------------#");
        System.out.println("# " + getNazwa() + " #");
        System.out.println("> " + adres.getNazwa() + " <");
        System.out.println("## Kraj: " + adres.getKraj());
        System.out.println("## Województwo: " + adres.getWojewodztwo());
        System.out.println("## Miasto: " + adres.getMiasto());
        System.out.println("## Kod pocztowy: " + adres.getKodPocztowy());
        System.out.println("## Ulica1: " + adres.getUlica1());
        if(!adres.getUlica2().isEmpty())
            System.out.println("## Ulica2: " + adres.getUlica2());
        System.out.println("> ------ <");
        System.out.println("# Numer telefonu: " + getNumerTelefonu());
        System.out.println("# Godziny otwarcia: " + getGodzinyOtwarcia());
        System.out.println("# Liczba czytelników: " + getLiczbaCzytelnikow());
        System.out.println("# Liczba książek: " + getLiczbaKsiazek());
        System.out.println("# Liczba pożyczonych książek: " + getLiczbaPozyczonychKsiazek());
        System.out.println("#-----------------------#");
    }

    public void setLiczbaKsiazek(int liczbaKsiazek) {
        this.liczbaKsiazek = liczbaKsiazek;
    }

    public void setLiczbaPozyczonychKsiazek(int liczbaPozyczonychKsiazek) {
        this.liczbaPozyczonychKsiazek = liczbaPozyczonychKsiazek;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getLiczbaKsiazek() {
        return liczbaKsiazek;
    }

    public int getLiczbaPozyczonychKsiazek() {
        return liczbaPozyczonychKsiazek;
    }

    public int getLiczbaCzytelnikow() {
        return liczbaCzytelnikow;
    }

    public String getGodzinyOtwarcia() {
        return godzinyOtwarcia;
    }
}
