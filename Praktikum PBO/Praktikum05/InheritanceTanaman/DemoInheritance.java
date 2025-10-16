package Praktikum05.InheritanceTanaman;

public class DemoInheritance {
    public static void main(String[] args) {
        System.out.println("=== DEMO TANAMAN: HIERARCHICAL INHERITANCE ===");

        // Instansiasi Objek Child 1: Pohon
        System.out.println("\n--- 1. Instansiasi Pohon Jati ---");
        Pohon jati = new Pohon("Tectona grandis", "Sedang", 3650, "1500 CM",
                              "Keras", 50.5f);
        
        System.out.println("\n*** INFO AWAL JATI ***");
        jati.printInfo();

        // Modifikasi Atribut Pohon
        System.out.println("\n-> Modifikasi Atribut Pohon Jati...");
        jati.usiaHari = 3680;           // Atribut diwariskan dari Tanaman
        jati.tinggiCM = "1520 CM";      // Atribut diwariskan dari Tanaman
        jati.diameterBatangCM = 51.2f;  // Atribut spesifik Pohon

        System.out.println("\n*** INFO AKHIR JATI ***");
        jati.printInfo();
        
        // --- Pemisah ---
        
        // Instansiasi Objek Child 2: Bunga
        System.out.println("\n--- 2. Instansiasi Bunga Mawar ---");
        Bunga mawar = new Bunga("Rosa chinensis", "Tinggi", 60, "30 CM",
                                "Pink", true);
        
        System.out.println("\n*** INFO AWAL MAWAR ***");
        mawar.printInfo();
        
        // Modifikasi Atribut Bunga
        System.out.println("\n-> Modifikasi Atribut Bunga Mawar...");
        mawar.kebutuhanAir = "Sangat Tinggi"; // Atribut diwariskan dari Tanaman
        mawar.warnaKelopak = "Merah";          // Atribut spesifik Bunga
        mawar.aromaWangi = false;             // Atribut spesifik Bunga (Mawar Layu)

        System.out.println("\n*** INFO AKHIR MAWAR ***");
        mawar.printInfo();
    }
}
