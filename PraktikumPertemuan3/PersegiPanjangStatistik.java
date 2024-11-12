package PraktikumPertemuan3;
public class PersegiPanjangStatistik {
    
    public static void Luas (int p, int l){
            int L = p * l;
        System.out.println("Luas Persegi Panjang = " + L);
    }
    public static int keliling (int p, int l) {
        int k = 2*(p+l);
        return k;
    }    
    public static void main(String[] args) {
        Luas(10,5);
        System.out.println(keliling(10,5));
    }
}
