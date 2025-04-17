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
        System.out.println("Mahasiswa: " + mahasiswa.nama);
        System.out.println("Mata Kuliah: " + matakuliah.NamaMK);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUts);
        System.out.println("Nilai UAS: " + nilaiUas);
        hitungNilaiAkhir(); 
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("------------------------");
    }
    
}