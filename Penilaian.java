public class Penilaian{
    Mahasiswa mahasiswa;
    matakuliah matakuliah;
    double nilaiTugas;
    double nilaiUts;
    double nilaiUas;
    double nilaiAkhir;

    Penilaian(Mahasiswa mahasiswa, matakuliah matakuliah, double nilaiTugas, double nilaiUts, double nilaiUas){
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir(){
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUts * 0.3) + (nilaiUas * 0.4);
    }

    void tampilPenilaian() {
        hitungNilaiAkhir();
        System.out.println("Mahasiswa: " + mahasiswa.nama + ", Mata Kuliah: " + matakuliah.NamaMK + "Nilai Akhir: " + nilaiAkhir);
    }

    
}