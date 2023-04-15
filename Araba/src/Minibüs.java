public abstract class Minibüs extends Araba{



    private boolean klimaliMi;

    public boolean isKlimaliMi() {
        return klimaliMi;
    }

    public void setKlimaliMi(boolean klimaliMi) {

        this.klimaliMi = klimaliMi;
    }
    public Minibüs(int maxHiz, double motorGucu, String renk) {

        super(maxHiz,motorGucu,renk);
        getUretilenArabaSayisi();
    }









}
