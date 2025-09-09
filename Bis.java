public class Bis {
    // Atribut
    String merk;
    float harga;
    int kecepatan;
    String jenisMesin;
    double liter;
    int kapasitasPenumpang;

    // Method untuk menyalakan bis
    public void nyalakanMesin() {
        System.out.println("Mesin bis " + merk + " dinyalakan.");
    }

    // Method untuk mematikan bis
    public void matikanMesin() {
        System.out.println("Masin bis " + merk + " dimatikan.");
    }

    // Method untuk menambah kecepatan
    public int tambahKecepatan(int increment) {
        return kecepatan += increment;
    }

    // Method untuk mengurangi kecepatan
    public int kurangKecepatan(int decrement) {
        return kecepatan -= decrement;
    }

    // Method untuk isi bahan bakar
    public void isiBahanBakar(double liter) {
        System.out.println(liter + " Liter bahan bakar diisi ke bis " + merk);
    }

    // Method untuk membunyikan klakson
    public void bunyikanKlakson() {
        System.out.println("Bunyi klakson bus " + merk + ": Telolet...");
    }

    // Method untuk menampilkan informasi kendaraan
    public void displayInformasi() {
        System.out.println("=====================================");
        System.out.println("Merk                : " + merk);
        System.out.println("Harga               : " + harga);
        System.out.println("Jenis Mesin         : " + jenisMesin);
        System.out.println("Kecepatan           : " + kecepatan + " km/jam");
        System.out.println("Kapasitas Penumpang : " + kapasitasPenumpang + " orang");
        System.out.println("=====================================");
    }
}
