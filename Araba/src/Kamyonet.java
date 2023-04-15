public abstract class Kamyonet extends Araba{


    private boolean DamperliMi;


    public boolean isDamperliMi() {

        return DamperliMi;
    }

    public void setDamperliMi(boolean damperliMi) {

        DamperliMi = damperliMi;
    }


    public Kamyonet(int maxHiz, double motorGucu, String renk) {
        super(maxHiz,motorGucu,renk);
        getUretilenArabaSayisi();
    }



    public abstract int gazaBas(int hiz, boolean arabaCalisirDurumdaMi) ;

    public abstract int freneBas(int hiz);








}
