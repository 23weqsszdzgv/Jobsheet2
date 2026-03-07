import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen[] arrayOfDosen = new Dosen[3]; // Menampung 3 dosen sesuai contoh output

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Wanita/Pria): ");
            String jkStr = sc.nextLine();
            boolean jenisKelamin = jkStr.equalsIgnoreCase("Wanita");
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------");

            arrayOfDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
        }

        // Memanggil Method dari DataDosen
        DataDosen dataDosenObj = new DataDosen();
        dataDosenObj.dataSemuaDosen(arrayOfDosen);
        dataDosenObj.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosenObj.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosenObj.infoDosenPalingTua(arrayOfDosen);
        dataDosenObj.infoDosenPalingMuda(arrayOfDosen);
    }
}