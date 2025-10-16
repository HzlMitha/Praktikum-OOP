package Praktikum05.InheritanceTanaman;

public class Pohon extends Tanaman {
    // Atribut Tambahan Child Class 1
    public String JenisKayu;
    public float diameterBatangCM;

    // Constructor 1: Tanpa Parameter
    public Pohon() {
        super();
        this.JenisKayu = "Lunak";
        this.diameterBatangCM = 0.0f;
        this.namaLatin = "Pohon Default"; // Modifikasi atribut warisan
        System.out.println("-> Objek Pohon (default) berhasil dibuat.");
    }

    // Constructor 2: Berparameter (Memanggil super() berparameter)
    public Pohon(String namaLatin, String kebutuhanAir, int usiaHari, String tinggiCM,
                 String jenisKayu, float diameterBatangCM) {
        super(namaLatin, kebutuhanAir, usiaHari, tinggiCM);
        this.JenisKayu = jenisKayu;
        this.diameterBatangCM = diameterBatangCM;
        System.out.println("-> Objek Pohon (" + namaLatin + ") berhasil dibuat.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis Kayu   : " + JenisKayu);
        System.out.println("Diameter Batang: " + diameterBatangCM + " CM");
        System.out.println("--------------------");
    }
}
