public class Adres {

   private String nazwa;
    private String kraj;
    private String wojewodztwo;

    private String kodPocztowy;
    private String miasto;
    private String ulica1;
    private String ulica2;

    public Adres(String nazwa, String kraj, String wojewodztwo, String kodPocztowy, String miasto, String ulica1, String ulica2) {
        this.nazwa = nazwa;
        this.kraj = kraj;
        this.wojewodztwo = wojewodztwo;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.ulica1 = ulica1;
        this.ulica2 = ulica2;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getKraj() {
        return kraj;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getUlica1() {
        return ulica1;
    }

    public String getUlica2() {
        return ulica2;
    }
}
