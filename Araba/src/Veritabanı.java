public abstract class Veritabanı {


    private  Veritabanı veritabani;

    public Veritabanı(Veritabanı veritabani)
    {
        this.veritabani=veritabani;
    }

    public Veritabanı() {

    }

    public abstract void veriKaydet(String veri);

    public abstract void veriGuncelle();
}
