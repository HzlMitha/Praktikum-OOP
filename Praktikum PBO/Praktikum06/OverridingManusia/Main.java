package Praktikum06.OverridingManusia;

public class Main {
    public static void main(String[] args) {
        // Deklarasi menggunakan tipe referensi Superclass (Manusia)
        Manusia[] anggotaKampus = new Manusia[3];

        // Objek Subclass dimasukkan ke dalam referensi Superclass
        anggotaKampus[0] = new Dosen();
        anggotaKampus[1] = new Mahasiswa();
        anggotaKampus[2] = new Manusia(); 

        System.out.println("--- Dynamic Method Dispatch ---");
        
        // Loop ini menunjukkan Polymorphism
        for (Manusia orang : anggotaKampus) {
            
            // 1. Metode 'bernafas()' tidak di-override, jadi metode Superclass yang dipanggil.
            orang.bernafas(); 
            
            // 2. Metode 'makan()' di-override. 
            // JVM AKAN MEMUTUSKAN metode mana yang dipanggil saat RUNTIME, 
            // berdasarkan TIPE OBJEK (Dosen, Mahasiswa, atau Manusia), BUKAN TIPE REFERENSI.
            orang.makan(); 
            System.out.println("---------------------------------");
        }
    
    }

    
}
