package TugasPertemuan4;
    // Kelas anak Anjing yang mewarisi dari kelas Hewan
class Anjing extends Hewan {

    public Anjing(String nama) {
        super(nama); // Memanggil constructor dari kelas induk
    }

    // metode bersuara()
    public void bersuara() {
        System.out.println(nama + " berkata: Guk guk!");
    }

    public void berlari() {
        System.out.println(nama + " sedang berlari.");
    }
}