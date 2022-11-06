package j19_StaticKeyword.Task03_Student.Ogrenci_Projesi;

import java.util.ArrayList;

public class Ogrenci {

    String name;
    int maxKredi;
    ArrayList<Ders> dersler ; // dersleri(Lesson class obj) saklayacak list

    public Ogrenci(String name, int maxKredi, ArrayList<Ders> dersler) {
        this.name = name;
        this.maxKredi = maxKredi;
        this.dersler = dersler;
    }

    public int toplamKredi(ArrayList<Ders> dersler){
        int topKredi =0;
        for(Ders d : dersler){
            topKredi += d.getKredi();
        }
        return topKredi;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", maxKredi=" + maxKredi +
                ", dersler=" + dersler +
                '}';
    }
}
