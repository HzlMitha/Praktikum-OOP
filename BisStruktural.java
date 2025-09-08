public class BisStruktural {
    public static void main(String[] args) {
        // Objek 1
        String merkBis1 = "Mercedes Benz";
        int kapasitasBis1 = 40;
        int kecepatanBis1 = 0;
        cetakInfoKendaraan(merkBis1, kapasitasBis1, kecepatanBis1);

        // Objek 2
        String merkBis2 = "Scania";
        int kapasitasBis2 = 45;
        int kecepatanBis2 = 0;
        cetakInfoKendaraan(merkBis2, kapasitasBis2, kecepatanBis2);

        // Objek 3
        String merkBis3 = "Hino";
        int kapasitasBis3 = 35;
        int kecepatanBis3 = 60;
        cetakInfoKendaraan(merkBis3, kapasitasBis3, kecepatanBis3);
        
        // Objek 4
        String merkBis4 = "Volvo";
        int kapasitasBis4 = 50;
        int kecepatanBis4 = 0;
        cetakInfoKendaraan(merkBis4, kapasitasBis4, kecepatanBis4);
        
        // Objek 5
        String merkBis5 = "MAN";
        int kapasitasBis5 = 48;
        int kecepatanBis5 = 0;
        cetakInfoKendaraan(merkBis5, kapasitasBis5, kecepatanBis5);
        
        // Objek 6
        String merkBis6 = "Isuzu";
        int kapasitasBis6 = 30;
        int kecepatanBis6 = 40;
        cetakInfoKendaraan(merkBis6, kapasitasBis6, kecepatanBis6);
        
        // Objek 7
        String merkBis7 = "Golden Dragon";
        int kapasitasBis7 = 42;
        int kecepatanBis7 = 0;
        cetakInfoKendaraan(merkBis7, kapasitasBis7, kecepatanBis7);
        
        // Objek 8
        String merkBis8 = "Fuso";
        int kapasitasBis8 = 38;
        int kecepatanBis8 = 0;
        cetakInfoKendaraan(merkBis8, kapasitasBis8, kecepatanBis8);
        
        // Objek 9
        String merkBis9 = "King Long";
        int kapasitasBis9 = 52;
        int kecepatanBis9 = 0;
        cetakInfoKendaraan(merkBis9, kapasitasBis9, kecepatanBis9);
        
        // Objek 10
        String merkBis10 = "Yutong";
        int kapasitasBis10 = 46;
        int kecepatanBis10 = 30;
        cetakInfoKendaraan(merkBis10, kapasitasBis10, kecepatanBis10);

        System.out.println("--- Proses Aksi Bis ---");
        // Memanggil fungsi untuk Objek 1
        nyalakanMesin(merkBis1);
        kecepatanBis1 = tambahKecepatan(merkBis1, kecepatanBis1, 60);

        // Memanggil fungsi untuk Objek 2
        nyalakanMesin(merkBis2);
        kecepatanBis2 = tambahKecepatan(merkBis2, kecepatanBis2, 80);

        // Memanggil fungsi untuk Objek 3
        kecepatanBis3 = tambahKecepatan(merkBis3, kecepatanBis3, 20);

        // Memanggil fungsi untuk Objek 6
        kecepatanBis6 = tambahKecepatan(merkBis6, kecepatanBis6, 10);

        // Memanggil fungsi untuk Objek 10
        kecepatanBis10 = tambahKecepatan(merkBis10, kecepatanBis10, 20);
    }

    public static void cetakInfoKendaraan(String merk, int kapasitasPenumpang, int kecepatan) {
        System.out.println("Merk: " + merk);
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang + " orang");
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("--------------------");
    }

    public static void nyalakanMesin(String merk) {
        System.out.println("Mesin bis " + merk + " dinyalakan.");
    }
    
    public static int tambahKecepatan(String merk, int kecepatan, int increment) {
        int kecepatanBaru = kecepatan + increment;
        System.out.println("Kecepatan bis " + merk + " bertambah menjadi " + kecepatanBaru + " km/jam.");
        return kecepatanBaru;
    }
}
