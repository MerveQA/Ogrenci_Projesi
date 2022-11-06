package j19_StaticKeyword.Task03_Student.Ogrenci_Projesi;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {   /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)  //DONE
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        ArrayList<Ders> dersliste = new ArrayList<>();
        Ders d01 = new Ders("matematik", 8);
        Ders d02 = new Ders("fizik", 5);
        Ders d03 = new Ders("kimya", 6);
        Ders d04 = new Ders("Beden",5);
        dersliste.add(d01);
        dersliste.add(d02);
        dersliste.add(d03);
        dersliste.add(d04);


        ArrayList<Ders> ogrList = new ArrayList<>();
        Ogrenci og01 = new Ogrenci("Hasan", 20, ogrList);

        boolean cikis = true;
        while (cikis) {
            System.out.println("Hangi dersi secmek istersiniz : ");
            String str = scan.nextLine();

            for (int i = 0; i < dersliste.size(); i++) {
                if (str.equalsIgnoreCase(dersliste.get(i).name)) {
                    if (og01.toplamKredi(ogrList) + dersliste.get(i).getKredi() <= og01.maxKredi) {
                        ogrList.add(dersliste.get(i));
                        System.out.println("Bu dersi alabilirsiniz ");
                        break;
                    } else System.out.println("Bu dersi alamazsiniz ");
                    System.out.println(ogrList);
                    cikis = false;
                }
            }
        }
    }

}
