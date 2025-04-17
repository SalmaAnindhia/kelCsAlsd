import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
            new Mahasiswa("22001",  " Ali Rahman",    "Informatika"),
            new Mahasiswa("22002",  " Budi Santoso",  "Informatika"),
            new Mahasiswa("22003",  " Citra Dewi",    "Sistem Informasi Bisnis")
        };
        matakuliah[] MK = {
            new matakuliah("MK001",  " Struktur Data",  3),
            new matakuliah("MK002",  " Basis Data",     3),
            new matakuliah("MK003",  " Desain Web",     3)
        };
        Penilaian[] penilaian = {
            new Penilaian(mhs[0], MK[0], 80, 85, 90),
            new Penilaian(mhs[0], MK[1], 60, 75, 70),
            new Penilaian(mhs[1], MK[0], 75, 70, 80),
            new Penilaian(mhs[2], MK[1], 85, 90, 95),
            new Penilaian(mhs[2], MK[2], 88, 90, 65)
        };
        int menu;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch(menu) {
                case 1:
                    for (Mahasiswa m : mhs) m.TampilMahasiswa();
                    break;
                case 2:
                    for (matakuliah matkul : MK) matkul.TampilMataKuliah();
                    break;
                case 3:
                    for (Penilaian p : penilaian) p.tampilPenilaian();
                    break;
                case 4:
                    Arrays.sort(penilaian, (a, b) -> Double.compare(b.nilaiAkhir, a.nilaiAkhir));
                    for (Penilaian p : penilaian) p.tampilPenilaian();
                    break;
                case 5:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String nim = sc.nextLine();
                    boolean ditemukan = false;
                    for (Mahasiswa m : mhs) {
                        if (m.nim.equals(nim)) {
                            System.out.println("Mahasiswa Ditemukan:");
                            m.TampilMahasiswa();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan)
                        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (menu != 0);
    }
}
    
    

