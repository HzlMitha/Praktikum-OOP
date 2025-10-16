package Praktikum04.Supplier;
import java.util.ArrayList;
import java.util.List;

public class Stok {
    private String idStok;
    private Produk produk;
    private Pemasok pemasok;
    private int jumlahStokSedia;
    private ArrayList<Penerimaan> riwayatPenerimaan;

    public Stok(String idStok, Produk produk, Pemasok pemasok) {
        this.idStok = idStok;
        this.produk = produk;
        this.pemasok = pemasok;
        this.jumlahStokSedia = 0;
        this.riwayatPenerimaan = new ArrayList<Penerimaan>();
    }

    public String getIdStok() {
        return idStok;
    }

    public void setIdStok(String idStok) {
        this.idStok = idStok;
    }

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public Pemasok getPemasok() {
        return pemasok;
    }

    public void setPemasok(Pemasok pemasok) {
        this.pemasok = pemasok;
    }

    public int getJumlahStokSedia() {
        return jumlahStokSedia;
    }

    public void setJumlahStokSedia(int jumlahStokSedia) {
        this.jumlahStokSedia = jumlahStokSedia;
    }

    public void tambahPenerimaan(Penerimaan penerimaan) {
        this.riwayatPenerimaan.add(penerimaan);
        this.jumlahStokSedia += penerimaan.getJumlahDiterima();
    }

    public void kurangiStok(int jml) {
        if (jumlahStokSedia >= jml) {
            this.jumlahStokSedia -= jml;
        } else {
            System.out.println("Jumlah Stok tidak mencukupi.");   
        }

        System.out.println("Jumlah Stok berkurang: " + jml);
    }

    // public void tambahStok(int jml) {
    //     this.jumlahStokSedia += jml;

    //     System.out.println("Jumlah Stok bertambah: " + jml);
    // }

    public String getInfo() {
        return "Stok: " + produk.getNama() + " dari " + pemasok.getNama() +
        " (ID Stok: " + idStok + ", Jumlah Tersedia: " + jumlahStokSedia + ")";
    }

    public List<Penerimaan> getRiwayatPenerimaan() {
        return riwayatPenerimaan;
    }

}
