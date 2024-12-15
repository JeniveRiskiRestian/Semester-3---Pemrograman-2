package TugasPertemuan4;
//Kelas induk
class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void bergerak() {
        System.out.println(nama + " sedang bergerak.");
    }

    public void bersuara() {
        System.out.println(nama + " membuat suara.");
    }
}
