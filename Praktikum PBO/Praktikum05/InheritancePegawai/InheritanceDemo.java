package Praktikum05.InheritancePegawai;


public class InheritanceDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("34329837", "Yansy Ayuningtyas", 3000000, "1234567890");
        // dosen1.nip = "34329837";
        // dosen1.nama = "Yansy Ayuningtyas";
        // dosen1.gaji = 3000000;
        // dosen1.nidn = "1234567890";
        
        System.out.println(dosen1.getAllInfo());

    }
}
