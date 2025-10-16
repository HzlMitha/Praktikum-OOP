package Praktikum04.Supplier;
import java.time.LocalDate;
import java.util.List;

public class TokoManajemenDemo {
    public static void main(String[] args) {
        Pemasok pemasokA = new Pemasok("PB01", "PT Jaya", "021-123456");
        Produk produkBuku = new Produk("B001", "Buku Tulis A5", "Buku tulis bergaris", 5000);
        Produk produkPensil = new Produk("P001", "Pensil 2B", "Pensil standar", 2000);

        System.out.println("--- Informasi Pemasok dan Produk ---");
        System.out.println(pemasokA.getInfo());
        System.out.println(produkBuku.getInfo());
        System.out.println(produkPensil.getInfo());
        System.out.println();

        Stok stokBuku = new Stok("STK001", produkBuku, pemasokA);
        Stok stokPensil = new Stok("STK002", produkPensil, pemasokA);

        Penerimaan penerimaanBuku1 = new Penerimaan("R001", LocalDate.now(), 50, 3500);
        stokBuku.tambahPenerimaan(penerimaanBuku1);
        Penerimaan penerimaanPensil1 = new Penerimaan("R002", LocalDate.now(), 200, 1800.0);
        stokPensil.tambahPenerimaan(penerimaanPensil1);
        Penerimaan penerimaanBuku2 = new Penerimaan("R003", LocalDate.now().plusDays(7), 50, 3500.0);
        stokBuku.tambahPenerimaan(penerimaanBuku2);

        System.out.println("--- Informasi Stok ---");
        System.out.println(stokBuku.getInfo());
        System.out.println(stokPensil.getInfo());

        System.out.println("\n--- Riwayat Penerimaan Buku ---");
        List<Penerimaan> riwayatBuku = stokBuku.getRiwayatPenerimaan();
        for (Penerimaan p : riwayatBuku) {
            System.out.println(p.getInfo());
        }

        System.out.println("\n--- Melakukan Pengurangan Stok (Penjualan) ---");
        stokBuku.kurangiStok(20); // Misal ada penjualan 20 buku
        System.out.println("Stok buku setelah penjualan: " + stokBuku.getJumlahStokSedia());
    }
}
