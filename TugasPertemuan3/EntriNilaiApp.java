package TugasPertemuan3;
import java.util.Scanner;
 class EntriNilai {
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Nilai Mahasiswa: ");
        int nilai = scanner.nextInt();

        // Membuat objek Mahasiswa dan menampilkan data
        Mahasiswa mahasiswa = new Mahasiswa(nama, nilai);
        mahasiswa.tampilkanData();
        
        scanner.close();
    }
}