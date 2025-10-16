package Praktikum05.InheritanceTanaman;

public class Tanaman {
    // Atribut Parent 
    public String namaLatin;
    public String kebutuhanAir;
    public int usiaHari;
    public String tinggiCM; 

    // Constructor 1: Tanpa Parameter
    public Tanaman() {
        this.namaLatin = "Tidak Diketahui";
        this.kebutuhanAir = "Sedang";
        this.usiaHari = 0;
        this.tinggiCM = "0 CM";
        System.out.println("-> Objek Tanaman (default) berhasil dibuat.");
    }

    // Constructor 2: Berparameter
    public Tanaman(String namaLatin, String kebutuhanAir, int usiaHari, String tinggiCM) {
        this.namaLatin = namaLatin;
        this.kebutuhanAir = kebutuhanAir;
        this.usiaHari = usiaHari;
        this.tinggiCM = tinggiCM;
        System.out.println("-> Objek Tanaman (" + namaLatin + ") berhasil dibuat.");
    }

    public void printInfo() {
        System.out.println("--- Info Tanaman ---");
        System.out.println("Nama Latin   : " + namaLatin);
        System.out.println("Kebutuhan Air: " + kebutuhanAir);
        System.out.println("Usia (hari)  : " + usiaHari);
        System.out.println("Tinggi       : " + tinggiCM);
    }
}
