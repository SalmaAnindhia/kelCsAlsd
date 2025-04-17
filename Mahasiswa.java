public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    void TampilMahasiswa() {
        System.out.println("nim: " + nim + "nama: " + nama + "prodi: " + prodi);
    }
}
    

