import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };
        matakuliah[] MK = {
            new matakuliah("MK001", "Struktur Data", 3),
            new matakuliah("MK002", "Basis Data", 3),
            new matakuliah("MK003", "Desain Web", 3)
        };
        Penilaian[] penilaian = {
            new Penilaian(mhs[0], MK[0], 80, 85, 90),
            new Penilaian(mhs[0], MK[1], 60, 75, 70),
            new Penilaian(mhs[1], MK[0], 75, 70, 80),
            new Penilaian(mhs[2], MK[1], 85, 90, 95),
            new Penilaian(mhs[2], MK[2], 88, 90, 65)
        };
    }
    
}
