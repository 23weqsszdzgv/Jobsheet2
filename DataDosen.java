public class DataDosen {

    public void dataSemuaDosen(Dosen[] arrayOfDosen) {
        System.out.println("======= DATA SEMUA DOSEN =======");
        int i = 1;
        for (Dosen d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            System.out.println("Kode          : " + d.Kode);
            System.out.println("Nama          : " + d.Nama);
            System.out.println("Jenis Kelamin : " + (d.JenisKelamin ? "Wanita" : "Pria"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("--------------------------------");
            i++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int wanita = 0, pria = 0;
        for (Dosen d : arrayOfDosen) {
            if (d.JenisKelamin) wanita++;
            else pria++;
        }
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("Jumlah Dosen Pria   : " + pria);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int totalUsiaWanita = 0, totalUsiaPria = 0;
        int jmlWanita = 0, jmlPria = 0;

        for (Dosen d : arrayOfDosen) {
            if (d.JenisKelamin) {
                totalUsiaWanita += d.usia;
                jmlWanita++;
            } else {
                totalUsiaPria += d.usia;
                jmlPria++;
            }
        }
        System.out.println("Rata-rata Usia Wanita : " + (jmlWanita > 0 ? (double)totalUsiaWanita/jmlWanita : 0));
        System.out.println("Rata-rata Usia Pria   : " + (jmlPria > 0 ? (double)totalUsiaPria/jmlPria : 0));
    }

    public void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        Dosen tertua = arrayOfDosen[0];
        for (Dosen d : arrayOfDosen) {
            if (d.usia > tertua.usia) tertua = d;
        }
        System.out.println("Dosen Paling Tua: " + tertua.Nama + " (" + tertua.usia + " tahun)");
    }

    public void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        Dosen termuda = arrayOfDosen[0];
        for (Dosen d : arrayOfDosen) {
            if (d.usia < termuda.usia) termuda = d;
        }
        System.out.println("Dosen Paling Muda: " + termuda.Nama + " (" + termuda.usia + " tahun)");
    }
}