import java.util.HashMap;
import java.util.ArrayList;


public class ListOfMaps {

    // ogrencilerin adini , soyadini, dersini, ve notunu tutan bir harita olusturmak istiyoruz
    // sonrasinda ogrencilerden bir liste olusturalim
    // ogrenci 1; ismi; john, soyadi; doe , ders; matematik, notu; 90
    // ogrenci 2; ismi; kate , soyadi; win , ders; fizik, notu; 100
    // ogrenci 3; ismi; juan, soyadi; jose , ders; spor, notu; 20


    public static void main(String[] args) {


        HashMap <String,String> ilkogrenci= new HashMap<>();
        ilkogrenci.put("isim", "john");
        ilkogrenci.put("soyadi", "doe");
        ilkogrenci.put("ders", "matematik");
        ilkogrenci.put("not", "90");

        System.out.println(ilkogrenci);


        HashMap <String,String> ikinciogrenci= new HashMap<>();
        ikinciogrenci.put("isim", "kate");
        ikinciogrenci.put("soyadi", "win");
        ikinciogrenci.put("ders", "fizik");
        ikinciogrenci.put("not", "100");

        System.out.println(ikinciogrenci);

        HashMap <String,String> ucuncuogrenci= new HashMap<>();
        ucuncuogrenci.put("isim", "juan");
        ucuncuogrenci.put("soyadi", "jose");
        ucuncuogrenci.put("ders", "spor");
        ucuncuogrenci.put("not", "20");


        System.out.println(ucuncuogrenci);

        System.out.println("------------------------------------------------------------------------------------");

        ArrayList<HashMap<String,String>> ogrenciListesi = new ArrayList<>();

        ogrenciListesi.add(ilkogrenci);
        ogrenciListesi.add(ikinciogrenci);
        ogrenciListesi.add(ucuncuogrenci);

        System.out.println(ogrenciListesi);


        ogrenciListesi.get(0);

        System.out.println(ogrenciListesi.get(0));



     // bize verilen listelerden once hasmap ulusturulur sonrasinda bunlar array l;iste eklenir icice gecmis listede diyebniliriz.






    }





























}
