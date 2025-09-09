public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    
    public Anggota (String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (jumlah > (limitPinjaman - jumlahPinjaman)) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += jumlah;
            System.out.println("Meminjam uang " + jumlah + "...");
        }
    }

    public void angsur(int jumlah) {
        int angsuranMinimal = (int) (this.jumlahPinjaman * 0.10);
        if (jumlah > this.jumlahPinjaman) {
            System.out.println("Jumlah angsuran melebihi sisa pinjaman");
            this.jumlahPinjaman = 0;
            System.out.println("Membayar angsuran " + jumlah + "...");
        } else {
            this.jumlahPinjaman -= jumlah;
            System.out.println("Membayar angsuran " + jumlah + "...");
        }
    }
}
