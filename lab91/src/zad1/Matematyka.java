package zad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matematyka {



    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        try{
            int liczba=scanner.nextInt();
            int liczba2=scanner.nextInt();
            System.out.println(liczba/liczba2);
        }
        catch(InputMismatchException e){
            System.out.println("Podaj liczby, a nie cos innego");
        }
        catch(ArithmeticException e){
            System.out.println("Nie dziel przez 0, spróbuj jeszcze raz");
        }
    }


    }

