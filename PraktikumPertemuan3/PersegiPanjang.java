package PraktikumPertemuan3;
public class PersegiPanjang {
    int p = 10;
    int l = 5;
    
    void luas () {
        int L = p * l;
        System.out.println("L = " + L);
    }
    public int keliling () {
        int k = 2*(p+l);
        return k;
    }    
    public static void main(String[] args) {
        PersegiPanjang P = new PersegiPanjang();
        P.luas();
        System.out.println("Keliling = " + P.keliling());
    }
}
