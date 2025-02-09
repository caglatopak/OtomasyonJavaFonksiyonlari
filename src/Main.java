//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


     Araba ilkArabam = new Araba();

     ilkArabam.setModel("volvo");
        System.out.println("arabamin modeli " + ilkArabam.getModel() + " ve fiyati " + ilkArabam.arabaFiyati); // ilkArabam.arabaFiyati yazmaya gerek yoktur cuynku araba sinifi uzerinden de araba fiyatina erisim saglanir


        ilkArabam.arabaFiyati= 450000; // yada Araba.arabaFiyati = 450000; de yazillabilir


        System.out.println("arabamin modeli " + ilkArabam.getModel() + " ve fiyati " + Araba.arabaFiyati);


      Araba yeniAraba = new Araba();

      yeniAraba.setModel("pejo");
        System.out.println("yeni arabamin modeli " + yeniAraba.getModel() + " ve fiyati "+ Araba.arabaFiyati);


    }
}