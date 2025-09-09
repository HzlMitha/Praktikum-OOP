public class DemoBis {
    public static void main(String[] args) {
        // instansiasi objek
        Bis bisPatas = new Bis();
       
        // Mengisi nilai atribut untuk bis patas
        bisPatas.merk = "Mercedes Benz";
        bisPatas.harga = (float) 250000000.0;
        bisPatas.jenisMesin = "Diesel";
        bisPatas.kapasitasPenumpang = 45;

        // Memanggil method untuk bis patas
        bisPatas.nyalakanMesin();
        int kecepatan = bisPatas.tambahKecepatan(50);
        System.out.println("Bis " + bisPatas.merk + " menambah kecepatan " + kecepatan + " km/jam");
        bisPatas.bunyikanKlakson();
        int kecepatan1 = bisPatas.tambahKecepatan(30);
        System.out.println("Bis " + bisPatas.merk + " menambah kecepatan " + kecepatan1 + " km/jam");
        int kecepatan2 = bisPatas.kurangKecepatan(60);
        System.out.println("Bis " + bisPatas.merk + " mengurangi kecepatan " + kecepatan2 + " km/jam");
        bisPatas.matikanMesin();
        bisPatas.isiBahanBakar(100);
        bisPatas.displayInformasi();

        System.out.println("===================================================================");

        // instansiasi objek
        Bis bisKota = new Bis();
       
        // Mengisi nilai atribut untuk bis kota
        bisKota.merk = "Hino RN 285";
        bisKota.harga = (float) 180000000.0;
        bisKota.jenisMesin = "Diesel";
        bisKota.kapasitasPenumpang = 60;

        // Memanggil method untuk bis kota
        bisKota.isiBahanBakar(250);
        bisKota.nyalakanMesin();
        int kecepatan3 = bisKota.tambahKecepatan(30);
        System.out.println("Bis " + bisKota.merk + " menambah kecepatan " + kecepatan3 + " km/jam");
        bisKota.bunyikanKlakson();
        int kecepatan4 = bisKota.tambahKecepatan(30);
        System.out.println("Bis " + bisKota.merk + " menambah kecepatan " + kecepatan4 + " km/jam");
        int kecepatan5 = bisKota.kurangKecepatan(40);
        System.out.println("Bis " + bisKota.merk + " mengurangi kecepatan " + kecepatan5 + " km/jam");
        bisKota.matikanMesin();
        bisKota.displayInformasi();

    }
}
