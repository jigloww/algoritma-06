public class Dosen09 {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen09(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        String jk = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.printf("%-10s %-15s %-10s %d\n", kode, nama, jk, usia);
    }
}
