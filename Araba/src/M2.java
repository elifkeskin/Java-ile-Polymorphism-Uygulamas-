public class M2 extends Minibüs{

    private static final int maxHiz = 190;

    @Override
    public int getMaxHiz() {
        return maxHiz;
    }
    public M2(int maxHiz, double motorGucu, String renk, boolean klimaliMi)
    {
        super(maxHiz,motorGucu,renk);
        this.isKlimaliMi();
        getUretilenArabaSayisi();
    }


    @Override
    public int gazaBas(int hiz, boolean arabaCalisirDurumdaMi) {


        hiz+=15;
        return hiz;
    }

    @Override
    public int freneBas(int hiz) {

        hiz-=15;
        return hiz;
    }
}
