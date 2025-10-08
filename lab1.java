import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static int minimumValue(ArrayList<Integer> lista1) {
        int a = lista1.get(0);
        for (int i = 1; i < lista1.size(); i++) {
            if (a > lista1.get(i))
                a = lista1.get(i);
        }
        return a;
    }

    public static double average(ArrayList<Double> lista) {
        double a=0;
        if (lista.isEmpty())
            return 0;
        for(int i=0;i<lista.size();i++)
            a+=lista.get(i);
        return a/lista.size();
    }


    public static void main(String[] args) {
       int liczbaCalkowita32bit = 0;
       float liczbaZmiennoprzecinkowa = 0.0f;
       double liczbaZmiennoprzecinkowaPodwojnaPrecyzja = 0.0;
       boolean wartoscLogiczna = false;
       char znak = '0';
       long liczbaCalkowita64bit = 0;
       short liczbaCalkowita16bit = 0;
       byte liczbaCalkowita8bit =0;
       int[] tablicaLiczbCalkowitych = {1,2,3};
       int[] pustaTablica = new int[1];
       pustaTablica[0] = 15;
       System.out.println(pustaTablica[0]);
       ArrayList<Integer> listaTablicowaIntow = new ArrayList<>();
       listaTablicowaIntow.add(1);
       listaTablicowaIntow.add(1);
       listaTablicowaIntow.add(5);
       listaTablicowaIntow.add(3);
       listaTablicowaIntow.add(1);
       System.out.println(listaTablicowaIntow.size());
       System.out.println(listaTablicowaIntow);
       System.out.println(listaTablicowaIntow.get(3));

       //zad1
        ArrayList<Integer> lista1 = new ArrayList<>();
        for(int i=0;i<10;i++) {
            lista1.add(i);
        }
        System.out.println(lista1.reversed());
        //drugi sposob
        for(int i=9;i>=0;i--) {
            System.out.println(lista1.get(i));;
        }

        //zad2
        System.out.println(minimumValue(lista1));

        //zad3
        ArrayList<Double> lista2 = new ArrayList<>();
        for(double i=0;i<10;i++) {
            lista2.add(i);
        }
        System.out.println(average(lista2));

        //zad4
            String napis = "Cześć";
        System.out.println(napis);
        napis = napis + "!";
        System.out.println(napis);
        StringBuilder stringBuilder = new StringBuilder("Cześć");
        stringBuilder.append("!");
        System.out.println(stringBuilder.toString());

        System.out.println("Wprowadź znak na piramidę");
        Scanner scanner = new Scanner(System.in);
        String znakPiramidy = scanner.next();
        System.out.println(znakPiramidy);
        int wysokoscPiramidy= scanner.nextInt();
        for(int i=0;i<wysokoscPiramidy;i++)
        {
            StringBuilder pietro = new StringBuilder();
            for(int j=0;j<wysokoscPiramidy -i-1; j++)
                pietro.append(' ');
            for(int k =0; k<2*i+1; k++){
                pietro.append(znakPiramidy);
            }
            System.out.println(pietro);
        }
}

}
