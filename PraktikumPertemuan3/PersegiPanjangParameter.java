package PraktikumPertemuan3;
public class PersegiPanjangParameter {
    public void Luas (int p, int l){
            int L = p * l;
        System.out.println("Luas Persegi Panjang = " + L);
    }
    public int keliling (int p, int l) {
        int k = 2*(p+l);
        return k;
    }    
    public static void main(String[] args) {
        PersegiPanjangParameter P = new PersegiPanjangParameter();
        P.Luas(10,3); P.Luas(100,50);
        System.out.println("keliling = " + P.keliling(1,3));
    }
}
