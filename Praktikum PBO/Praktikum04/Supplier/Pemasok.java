package Praktikum04.Supplier;

public class Pemasok {
    private String kodeSupplier;
    private String nama;
    private String nomorTelephone;

    public Pemasok(String kode, String nama, String noTelp) {
        kodeSupplier = kode;
        this.nama = nama;
        nomorTelephone = noTelp;
    }

    public String getKodeSupplier() {
        return kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelephone() {
        return nomorTelephone;
    }

    public void setNomorTelephone(String nomorTelephone) {
        this.nomorTelephone = nomorTelephone;
    }

    public String getInfo() {
        return "Pemasok: " + nama + " (Kode: " + kodeSupplier + ", Telp: " + nomorTelephone + ")";
    }
}
