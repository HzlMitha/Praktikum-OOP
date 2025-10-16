package Praktikum05.InheritanceTanaman;

public class Bunga extends Tanaman {
    // Atribut Tambahan Child Class 2
    public String warnaKelopak;
    public boolean aromaWangi;

    // Constructor 1: Tanpa Parameter
    public Bunga() {
        super();
        this.warnaKelopak = "Putih";
        this.aromaWangi = false;
        this.namaLatin = "Bunga Default"; // Modifikasi atribut warisan
        System.out.println("-> Objek Bunga (default) berhasil dibuat.");
    }

    // Constructor 2: Berparameter (Memanggil super() berparameter)
    public Bunga(String namaLatin, String kebutuhanAir, int usiaHari, String tinggiCM,
                 String warnaKelopak, boolean aromaWangi) {
        super(namaLatin, kebutuhanAir, usiaHari, tinggiCM);
        this.warnaKelopak = warnaKelopak;
        this.aromaWangi = aromaWangi;
        System.out.println("-> Objek Bunga (" + namaLatin + ") berhasil dibuat.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Warna Kelopak: " + warnaKelopak);
        System.out.println("Aroma Wangi  : " + (aromaWangi ? "Ya" : "Tidak"));
        System.out.println("--------------------");
    }
}