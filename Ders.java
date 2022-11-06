package j19_StaticKeyword.Task03_Student.Ogrenci_Projesi;

public class Ders {

    // fields
    String name;
    private int kredi;

    // p.li const.
    public Ders(String name, int kredi) {
        this.name = name;
        this.kredi = kredi;
    }

    @Override
    public String toString() {
        return "Ders{" +
                "name='" + name + '\'' +
                ", kredi=" + kredi +
                '}';
    }

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        if(kredi>=1 & kredi<=5){
            this.kredi = kredi;
        } else {
            System.out.println(" hatali deger ");
        }

    }
}
