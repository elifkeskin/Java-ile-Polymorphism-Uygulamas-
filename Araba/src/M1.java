public class M1 extends Minibüs{
    private  final int maxHiz = 180;


    @Override
    public int getMaxHiz() {
        return maxHiz;
    }


    public M1(int maxHiz, double motorGucu, String renk, boolean klimaliMi)
    {
        super(maxHiz,motorGucu,renk);
        this.isKlimaliMi();
        getUretilenArabaSayisi();
    }

    @Override
    public int gazaBas(int hiz, boolean arabaCalisirDurumdaMi) {

        hiz+=10;
        return hiz;
    }

    @Override
    public int freneBas(int hiz) {

        hiz-=10;
        return hiz;
    }
}
