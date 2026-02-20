package Jobsheet2;
// Class Mahasiswa_27
public class Mahasiswa_27 {
    // Atribut-atribut untuk menyimpan data mahasiswa seperti nama, nim, kelas, dan ipk
    public Mahasiswa_27 () {
        // Konstruktor default
    }
    public Mahasiswa_27 (String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    String nama;
    String nim;
    String kelas;
    double ipk;
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
// Method untuk menampilkan data mahasiswa
    }
    void ubahKelas (String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIPK (double ipkBaru) {
        ipk = ipkBaru;
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik" ;
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        }else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
        }
    }