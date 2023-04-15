public class K2 extends Kamyonet{

    private  final int maxHiz = 100;

    public K2(int maxHiz, double motorGucu, String renk, boolean damperliMi) {
        super(maxHiz, motorGucu, renk);
        this.isDamperliMi();
        getUretilenArabaSayisi();
    }


    @Override
    public int getMaxHiz() {
        return maxHiz;
    }

    @Override
    public int gazaBas(int hiz, boolean arabaCalisirDurumdaMi) {

        hiz+=5;
        return hiz;
    }

    @Override
    public int freneBas(int hiz) {

        hiz-=5;
        return hiz;
    }
}
