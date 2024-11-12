package TugasPertemuan2;
public class PanggilObjek {
    public static void main(String[] args) {
      // Membuat objek Mahasiswa, Dosen, dan MataKuliah
        MasterMahasiswa mm = new MasterMahasiswa();
        mm.namaMahasiswa = "Jenyve Riski Restian";
        mm.nim = "2355201032";
        mm.prodi = "ILMU KOMPUTER";
      
        MasterDosen md = new MasterDosen();
        md.namaDosen = "Veradella YM";
      
        MasterMatakuliah mk = new MasterMatakuliah();
        mk.namaMataKuliah = "Pemrograman Dua";
        mk.dosenPengampu = "Abd Charis Fauzan";
        mk.Sks = "4";

        // Menampilkan informasi mahasiswa, dosen, dan mata kuliah
        System.out.println("==========Membuat Objek Mahasiswa, Dosen, Matakuliah==========");
        System.out.println("Nama Mahasiswa = " + mm.namaMahasiswa);
        System.out.println("Nim = " + mm.nim);
        System.out.println("Prodi = " + mm.prodi);
        System.out.println("Nama Dosen = " + md.namaDosen);
        System.out.println("Nama Matakuliah = " + mk.namaMataKuliah);
        System.out.println("Dosen Pengampu = " + mk.dosenPengampu);
        System.out.println("SKS = " + mk.Sks);

    }
}
