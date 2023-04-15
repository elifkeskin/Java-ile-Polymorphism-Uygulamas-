public class K1 extends Kamyonet{


    private  final int maxHiz=90;

    @Override
    public int getMaxHiz() {

        return maxHiz;
    }

    public K1(int maxHiz, double motorGucu, String renk, boolean damperliMi)
    {
        super(maxHiz,motorGucu,renk);
        this.isDamperliMi();
        getUretilenArabaSayisi();
    }

    @Override
    public int gazaBas(int hiz, boolean arabaCalisirDurumdaMi) {

        hiz+=7;
        return hiz;
    }

    @Override
    public int freneBas(int hiz) {

        hiz-=7;
        return hiz;
    }
}
