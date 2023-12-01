// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Biblioteka b1 = new Biblioteka(
                "Biblioteka Narodowa",
                100,
                30,
                10,
                "8:30 AM - 8:30 PM", "22 608 29 99",
                new Adres(
                        "Adres Biblioteki Narodowej",
                "Polska",
                "Mazowieckie",
                "02-086 ",
                "Warszawa",
                "al. Niepodległości 213",
                ""
        )
        );

        Uzytkownik u1 = new Uzytkownik("superUzytkownik",
                "ekstermalnieScisleTajneHaslo",
                "superUzytkownik@supersystem.com");

        Czytelnik c1 = new Czytelnik(
                "JestemSobieCzytelnikiem",
                "nieznamgohihi",
                "czytelnik@polska.com",
                5550123,
                4,
                new Adres("Mój pierwszy adres!",
                        "Polska",
                        "Małopolskie",
                        "31-422",
                        "Kraków",
                        "Rynek Główny",
                        "5"),
                false
        );
        Ksiazka k1 = new Ksiazka(
                "Java For Dummies",
                "978-1119861645",
                false,
                b1,
                null);
        Ksiazka k2 = new Ksiazka("Java: Learn Java in One Day and Learn It Well.",
                "979-8821535474",
                true,
                b1,
                c1);
        b1.pokaz();
        u1.pokaz();
        c1.pokaz();
        System.out.println("");
        System.out.println("");
        k1.pokaz();
        System.out.println("");
        System.out.println("");
        k2.pokaz();
    }
}