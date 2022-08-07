import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ders=new Scanner(System.in);
         int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.println("Matematik notunuzu giriniz:");
        mat=ders.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik=ders.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya=ders.nextInt();

        System.out.println("Turkce notunuzu giriniz:");
        turkce=ders.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        tarih=ders.nextInt();

        System.out.println("Muzik notunuzu giriniz:");
        muzik=ders.nextInt();


        double ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Derslerinizin ortalamasi: "+ortalama);

        String sonuc= (ortalama>60)?"Gectiniz":"Kaldiniz";
        System.out.println("SONUC: "+sonuc);






    }
}
