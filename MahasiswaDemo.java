public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "244107060049";
        m2.nama = "Dian Paramitha";
        m2.alamat = "Bekasi, Jawa Barat";
        m2.kelas = "2F";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "244107060032";
        m3.nama = "Monik Nabila Putri";
        m3.alamat = "Bandung, Jawa barat";
        m3.kelas = "2B";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}
