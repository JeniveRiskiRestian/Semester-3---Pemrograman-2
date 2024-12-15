package TugasPertemuan4;
    // Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Ayam ayam = new Ayam("Chiki");
        Anjing anjing = new Anjing("Buddy");

        // Memanggil metode dari kelas induk dan metode khusus kelas anak
        ayam.bergerak();
        ayam.bersuara();
        ayam.mencakar();

        anjing.bergerak();
        anjing.bersuara();
        anjing.berlari();
    }
}