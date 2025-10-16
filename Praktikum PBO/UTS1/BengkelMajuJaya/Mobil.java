package UTS1.BengkelMajuJaya;

public class Mobil extends Kendaraan {

    public Mobil(String noPlat, String merk, int tahun) {
        super(noPlat, merk, tahun, "Mobil");
    }

    // overriding: biaya servis khusus mobil
    @Override
    public int biayaServis() {
        return 500000;
    }

    // overloading di subclass: contoh variasi dengan biaya tambahan
    public int biayaServis(int tambahan) {
        return biayaServis() + tambahan;
    }
}
