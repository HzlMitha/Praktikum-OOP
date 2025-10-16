package Praktikum04.Supplier;

public class Produk {
    private String kodeProduk;
    private String nama;
    private String deskripsi;
    private double hargaBeliSatuan;

    public Produk (String kodeProduk, String nama, String deskripsi, double hargaBeliSatuan) {
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.hargaBeliSatuan = hargaBeliSatuan;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getHargaBeliSatuan() {
        return hargaBeliSatuan;
    }

    public void setHargaBeliSatuan(double hargaBeliSatuan) {
        this.hargaBeliSatuan = hargaBeliSatuan;
    }

    public String getInfo() {
        return kodeProduk + ", " + nama + ", " + deskripsi + ", Rp " + hargaBeliSatuan;
    }
}
