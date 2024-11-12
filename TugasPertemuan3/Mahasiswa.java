package TugasPertemuan3;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private int nilai;
    private String keterangan;

    // Konstruktor untuk inisialisasi objek Mahasiswa
    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
        this.keterangan = hitungKeterangan();
    }

    // Method untuk menghitung keterangan berdasarkan nilai
    private String hitungKeterangan() {
        return (nilai > 70) ? "Lulus" : "Tidak Lulus";
    }

    // Method untuk menampilkan hasil data mahasiswa
    public void tampilkanData() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Keterangan: " + keterangan);
    }
}
