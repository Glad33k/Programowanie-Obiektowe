package exceptions;

public class NiepoprawnyFormatDanychException extends Exception{


    public NiepoprawnyFormatDanychException(String dowodPrawdopodobniePodrobiony) {
        super(dowodPrawdopodobniePodrobiony);
    }
}
