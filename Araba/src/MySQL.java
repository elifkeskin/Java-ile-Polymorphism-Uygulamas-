public class MySQL extends Veritabanı{

    public MySQL(Veritabanı veritabani) {
        super(veritabani);
    }

    public MySQL() {
        super();
    }


    @Override
    public void veriKaydet(String veri) {
        System.out.println("Kaydedilen veri : " + veri);
        System.out.println("Veri mysql veri tabanına kayıt edildi...");
    }

    @Override
    public void veriGuncelle() {

        System.out.println("Veri güncellendi...");
    }

}
