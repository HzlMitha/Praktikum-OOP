package Praktikum04.Supplier;
import java.time.LocalDate;

public class Penerimaan {
    private String idPenerimaan;
    private LocalDate tanggalPenerimaan;
    private int jumlahDiterima;
    private double hargaBeliPerUnit;

    public Penerimaan(String idPenerimaan, LocalDate tanggalPenerimaan, int jumlahDiterima, double hargaPerUnit) {
        this.idPenerimaan = idPenerimaan;
        this.tanggalPenerimaan = tanggalPenerimaan;
        this.jumlahDiterima = jumlahDiterima;
        this.hargaBeliPerUnit = hargaPerUnit;
    }

    public String getIdPenerimaan() {
        return idPenerimaan;
    }

    public void setIdPenerimaan(String idPenerimaan) {
        this.idPenerimaan = idPenerimaan;
    }

    public LocalDate getTanggalPenerimaan() {
        return tanggalPenerimaan;
    }

    public void setTanggalPenerimaan(LocalDate tanggalPenerimaan) {
        this.tanggalPenerimaan = tanggalPenerimaan;
    }

    public int getJumlahDiterima() {
        return jumlahDiterima;
    }

    public void setJumlahDiterima(int jumlahDiterima) {
        this.jumlahDiterima = jumlahDiterima;
    }

    public double getHargaBeliPerUnit() {
        return hargaBeliPerUnit;
    }

    public void setHargaBeliPerUnit(double hargaBeliPerUnit) {
        this.hargaBeliPerUnit = hargaBeliPerUnit;
    }

    public String getInfo() {
        return "Penerimaan ID: " + idPenerimaan + " (Tanggal: " + tanggalPenerimaan + 
        ", Jumlah: " + jumlahDiterima + ", Harga/Unit: " + hargaBeliPerUnit + ")";
    }
}
