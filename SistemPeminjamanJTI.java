import java.util.Scanner;

import CM.Buku;
import CM.Peminjaman;

public class SistemPeminjamanJTI {
    public static void main(String[] args) {
        // Inisialisasi Data Mahasiswa [cite: 57]
        Mahasiswa[] daftarMhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // Inisialisasi Data Buku [cite: 59]
        Buku[] daftarBuku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        // Inisialisasi Data Peminjaman (Array of Object) [cite: 61]
        Peminjaman[] listPinjam = {
            new Peminjaman(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman(daftarMhs[1], daftarBuku[1], 3),
            new Peminjaman(daftarMhs[2], daftarBuku[2], 10),
            new Peminjaman(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman(daftarMhs[0], daftarBuku[1], 4)
        };

        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Terbesar)");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa m : daftarMhs) m.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku b : daftarBuku) b.tampilBuku();
                    break;
                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman p : listPinjam) p.tampilPeminjaman();
                    break;
                case 4:
                    // Implementasi Insertion Sort (Descending/Terbesar) [cite: 21, 156]
                    for (int i = 1; i < listPinjam.length; i++) {
                        Peminjaman temp = listPinjam[i];
                        int j = i - 1;
                        while (j >= 0 && listPinjam[j].denda < temp.denda) {
                            listPinjam[j + 1] = listPinjam[j];
                            j--;
                        }
                        listPinjam[j + 1] = temp;
                    }
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman p : listPinjam) p.tampilPeminjaman();
                    break;
                case 5:
                    // Implementasi Sequential Search berdasarkan NIM [cite: 22, 156]
                    System.out.print("Masukkan NIM: ");
                    String cariNim = sc.nextLine();
                    boolean ditemukan = false;
                    System.out.println("\nHasil Pencarian NIM " + cariNim + ":");
                    for (Peminjaman p : listPinjam) {
                        if (p.mhs.nim.equals(cariNim)) {
                            p.tampilPeminjaman();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) System.out.println("Data tidak ditemukan.");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}