package exceptions;

public class SklepMonopolowy {
    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Wiek zweryfikowany pomyślnie, można sprzedać");
        } else {
            throw new IllegalArgumentException("Klient nie ma 18 lat");
        }
    }

    public static void checkID(String imie) throws NiepoprawnyFormatDanychException {
        if (imie.charAt(0) >= 'A' && imie.charAt(0) <= 'Z') {
            System.out.println("Imie prawidłowe");
        } else throw new NiepoprawnyFormatDanychException("Dowód prawdopodobnie podrobiony");
    }

    public static void main(String[] args) {
        checkAge(18);
        //checkAge(15);
        try {
            checkID("Stanisław");
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println("Podrobiony dowód");
        }
        try {
            checkID("stanisław");
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println("Podrobiony dowód");
        }
    }
}
