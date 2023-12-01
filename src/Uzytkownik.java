public class Uzytkownik {
    private String nickname;
    private String tajneHaslo;
    private String adresMail;

    public Uzytkownik(String nickname, String tajneHaslo, String adresMail) {
        this.nickname = nickname;
        this.tajneHaslo = tajneHaslo;
        this.adresMail = adresMail;
    }

    public void pokaz() {
        System.out.println("================================");
        System.out.println("* Nickname: " + getNickname());
        System.out.println("* Super TAJNE haslo: " + getTajneHaslo());
        System.out.println("* Adres mailowy: " + getAdresMail());
        System.out.println("================================");
    }

    public String getNickname() {
        return nickname;
    }

    public String getTajneHaslo() {
        return tajneHaslo;
    }

    public String getAdresMail() {
        return adresMail;
    }
}
