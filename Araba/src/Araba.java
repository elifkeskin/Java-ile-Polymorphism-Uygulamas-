public abstract class Araba {

    private static boolean arabaCalısırDurumdaMi;
    public static boolean isArabaCalısırDurumdaMi() {
        return arabaCalısırDurumdaMi;
    }

    public static void setArabaCalısırDurumdaMi(boolean arabaCalısırDurumdaMi) {
        Araba.arabaCalısırDurumdaMi = arabaCalısırDurumdaMi;
    }


    private static int uretilenArabaSayisi=0;

    public static int getUretilenArabaSayisi() {
        return uretilenArabaSayisi;
    }

    public static void setUretilenArabaSayisi(int uretilenArabaSayisi) {
        Araba.uretilenArabaSayisi = uretilenArabaSayisi;
    }

    public Araba(int i) {

    }

    public Araba(int maxHiz, double motorGucu, String renk) {
        this.maxHiz = maxHiz;
        this.motorGucu=motorGucu;
        this.renk=renk;
        uretilenArabaSayisi++;
    }


    private String renk;

    private int maxHiz;
    private double motorGucu;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMaxHiz() {
        return maxHiz;
    }

    public void setMaxHiz(int maxHiz) {
        this.maxHiz = maxHiz;
    }

    public double getMotorGucu() {
        return motorGucu;
    }

    public void setMotorGucu(double motorGucu) {
        this.motorGucu = motorGucu;
    }

    public  abstract int gazaBas(int hiz, boolean arabaCalısırDurumdaMi);

    public abstract int freneBas(int hiz);



}
