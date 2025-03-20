class DataDosen09 {
    Dosen09[] dataDosen = new Dosen09[10]; 
    int idx = 0; 

    public void tambah(Dosen09 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        System.out.printf("%-10s %-15s %-10s %s\n", "Kode", "Nama", "Gender", "Usia");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen09 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan secara ASCENDING (Termuda ke Tertua).");
    }

    public void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen09 temp = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < temp.usia) { 
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
        System.out.println("Data berhasil diurutkan secara DESCENDING (Tertua ke Termuda).");
    }
}
