package UTS1.BengkelMajuJaya;

public class Motor extends Kendaraan {

    public Motor(String noPlat, String merk, int tahun) {
        super(noPlat, merk, tahun, "Motor");
    }

    // overriding: biaya servis khusus motor
    @Override
    public int biayaServis() {
        return 250000;
    }

    // overloading di subclass: contoh variasi dengan biaya tambahan
    public int biayaServis(int tambahan) {
        return biayaServis() + tambahan;
    }
}