
    public class arabaUreticisi  {
        private Veritabanı veritabani;

        public arabaUreticisi(Veritabanı veritabani) {

            this.veritabani = veritabani;
        }


        public void arabaUret() {
            System.out.println("Araba uretildi");
            veritabani.veriKaydet("Araba");

        }

    }
