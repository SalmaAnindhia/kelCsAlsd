public class matakuliah {
    String KodeMK;
    String NamaMK;
    int SKS;

    matakuliah(String kodeMK, String namaMK, int sks) {
        this.KodeMK = kodeMK;
        this.NamaMK = namaMK;
        this.SKS = sks;
    }
    void TampilMataKuliah () {
        System.out.println("Kode MK: " + KodeMK + "Nama MK: " + NamaMK + "Sks: " + SKS);
    }
}

