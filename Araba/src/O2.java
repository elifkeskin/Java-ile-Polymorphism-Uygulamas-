public class O2 extends Otomobil{

    private static final int maxHiz = 300;

    @Override
    public int getMaxHiz() {
        return maxHiz;
    }


    public O2(int maxHiz, double motorGucu, String renk, boolean tekKapiliMi)
    {
        super(maxHiz,motorGucu,renk);
        this.isTekKapiliMi();
        getUretilenArabaSayisi();
    }

    @Override
    public int gazaBas(int hiz, boolean arabaCalisirDurumdaMi) {

        hiz+=25;
        return hiz;
    }

    @Override
    public int freneBas(int hiz) {

        hiz-=25;
        return hiz;
    }
}
