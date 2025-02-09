import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        // anahtar deger eslemesi yapmak istedigimiz ve listenin uzun oldugu durumlarda hashMap kullanilir
        //hashMap kullanilirken deger olarak sadece nonprimitive degerler alir. int kullanilmaz ama Integer non primitive deger kullanilir.

        // put ile listeye ekleme yapilir. put methodu bir string ve degeri icerir

        HashMap<String,Integer> ogrenciNotu= new HashMap<>();

        ogrenciNotu.put("ozan", 100);
        ogrenciNotu.put("ayse",  50);
        ogrenciNotu.put("veli ", 85);

        System.out.println(ogrenciNotu);

        System.out.println(" ozanin ders notu" + ogrenciNotu.get("ozan")); // get ile bilgi cekilir
        System.out.println("butun anahtar degerler" + ogrenciNotu.keySet());// anahtar degerler cekilir
        System.out.println("butun degerler" + ogrenciNotu.values()); // sadece degerler bulunur
        System.out.println("butun girdi ciftleri" + ogrenciNotu.entrySet()); // her iki tarafta sorgulanir

        ogrenciNotu.replace("ozan", 25); // guncelleme
        System.out.println(ogrenciNotu);
        ogrenciNotu.remove("ozan"); // silme , listeden kaldirma


    }
}
