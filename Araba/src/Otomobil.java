public abstract class Otomobil extends Araba{

      private boolean tekKapiliMi;

      public boolean isTekKapiliMi() {
            return tekKapiliMi;
      }

      public void setTekKapiliMi(boolean tekKapiliMi) {
            this.tekKapiliMi = tekKapiliMi;
      }

      public Otomobil(int maxHiz, double motorGucu, String renk) {
            super(maxHiz, motorGucu, renk);
            getUretilenArabaSayisi();
      }

      public abstract int gazaBas(int hiz, boolean arabaCalisirDurumdaMi);
      public abstract int freneBas(int hiz);
}
