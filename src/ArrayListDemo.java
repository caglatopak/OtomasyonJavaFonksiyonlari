import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {


        ArrayList<String> isimlerListesi = new ArrayList<>();


        // add listeye ekleme yapma

        isimlerListesi.add("ozan");
        isimlerListesi.add("sevinc");

        System.out.println(isimlerListesi);

        isimlerListesi.add("ceyda");
        isimlerListesi.add("salih");

        System.out.println(isimlerListesi);


        // get ile index numarasina gore bulma

        System.out.println(isimlerListesi.get(2) + isimlerListesi.get(3) + isimlerListesi.getLast() + isimlerListesi.getFirst());

        // listedeki bir referansi guncellemek icin set kullanilir

        isimlerListesi.set(2, " ayse ");

        System.out.println(isimlerListesi.get(2));


        // listeden referans cikarmak icin remove kullanilir. eski degeri bulmak istersek return kullaniriz.


        String silinenIsim = isimlerListesi.remove(1);
        System.out.println(silinenIsim + "listeden cikarilmistir");

        isimlerListesi.add("filiz");
        isimlerListesi.add("aynur");
        isimlerListesi.add("eda");
        isimlerListesi.add("leyla");
        isimlerListesi.add("melahat");

        System.out.println(isimlerListesi);

        // size fonksiyonu ile listenin boyutu iogrenilir;

        isimlerListesi.size();

        System.out.println("listemizin element sayisi = " + isimlerListesi.size());

        // listede isim arama contains ile bulurnur

        System.out.println("listemizde ayse ismi " + isimlerListesi.contains(" ayse "));
        System.out.println("listemizde fatma ismi " + isimlerListesi.contains("fatma"));
        System.out.println("listemizde leyla ismi " + isimlerListesi.contains("leyla"));
        System.out.println("listemizde fadime ismi " + isimlerListesi.contains("fadime"));

        System.out.println(isimlerListesi);


        // listede ismin liste numarasini bulmak icin indexof kullanilir

        System.out.println(isimlerListesi.indexOf(" ayse "));

        // listenn bos olup olmadigini donduren fonksiyon ise isEmpty fonksiyonudur

        System.out.println(isimlerListesi.isEmpty()); // isimler listesi bosmu ?

        System.out.println("----------------------------------------------------------------------------------");

        // array list ler siklikla for loop larin icinde kullanilir

        for (String isim:isimlerListesi) {
            System.out.println(isim);

        }






































    }
}