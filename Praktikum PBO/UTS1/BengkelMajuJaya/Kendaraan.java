package UTS1.BengkelMajuJaya;

public class Kendaraan {
    private String noPlat;
    private String merk;
    private int tahun;
    private String jenis;

    public Kendaraan(String noPlat, String merk, int tahun, String jenis) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.tahun = tahun;
        this.jenis = jenis;
    }

    // enkapsulasi: getter/setter
    public String getNoPlat() { 
        return noPlat; 
    }
    public String getMerk() { 
        return merk; 
    }
    public int getTahun() { 
        return tahun; 
    }
    public String getJenis() { 
        return jenis; 
    }

    public void setNoPlat(String noPlat) { 
        this.noPlat = noPlat; 
    }
    public void setMerk(String merk) { 
        this.merk = merk; 
    }
    public void setTahun(int tahun) { 
        this.tahun = tahun; 
    }

    // polimorfisme: metode dasar (akan dioverride)
    public int biayaServis() {
        return 0;
    }

    // overloading: menambahkan opsi cuci
    public int biayaServis(boolean includeCuci) {
        int biaya = biayaServis();
        if (includeCuci) biaya += 50000; // biaya cuci tetap
        return biaya;
    }

    public void printData() {
        System.out.println("No Plat: " + getNoPlat());
        System.out.println("Merk: " + getMerk());
        System.out.println("Tahun: " + getTahun());
        System.out.println("Jenis: " + getJenis());
        System.out.println("Biaya Servis: Rp" + biayaServis());
        System.out.println("Biaya Servis + Cuci: Rp" + biayaServis(true));
    }

    // overload: tampilkan sesuai pilihan includeCuci dari user
    public void printData(boolean includeCuci) {
        System.out.println("No Plat: " + getNoPlat());
        System.out.println("Merk: " + getMerk());
        System.out.println("Tahun: " + getTahun());
        System.out.println("Jenis: " + getJenis());
        if (includeCuci) {
            System.out.println("Biaya Servis + Cuci: Rp" + biayaServis(true));
        } else {
            System.out.println("Biaya Servis: Rp" + biayaServis());
        }
    }
}
