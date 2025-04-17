public class Penilaian{
    Mahasiswa mahasiswa;
    matakuliah matakuliah;
    double nilaiTugas;
    double nilaiUts;
    double nilaiUas;
    double nilaiAkhir;

    Penilaian(double nilaiTugas, double nilaiUts, double nilaiUas){
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    void hitungNilaiakhir(){
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUts * 0.3) + (nilaiUas * 0.4);
    }
}