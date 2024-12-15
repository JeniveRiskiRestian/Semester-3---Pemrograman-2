package TugasPertemuan4;
//Kelas anak Ayam yang mewarisi dari kelas Hewan
    class Ayam extends Hewan {

    public Ayam(String nama) {
        super(nama); // Memanggil constructor dari kelas induk
    }

    // metode bersuara()
    public void bersuara() {
        System.out.println(nama + " berkata: kukuruyuk!");
    }

    public void mencakar() {
        System.out.println(nama + " sedang mencakar.");
    }
}