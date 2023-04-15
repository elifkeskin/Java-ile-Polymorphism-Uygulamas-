public class Main {
    public static void main(String[] args) {


         Veritabanı veritabanı = new MySQL();


         arabaUreticisi arabaUreticisi=new arabaUreticisi(veritabanı);


         arabaUreticisi.arabaUret();


         Araba araba=new O1(180,1.4,"kırmızı",true);
         Araba araba1=new O1(170,1.6,"Mavi", true);
         Araba araba2=new O1(150,1.6,"Gri", false);
         System.out.println(araba1.gazaBas(75,true));
         System.out.println(araba.freneBas(80));
         System.out.println(O1.getUretilenArabaSayisi());
         System.out.println(araba.getMaxHiz());

    }


}