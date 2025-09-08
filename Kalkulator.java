public class Kalkulator {
    double angka1, angka2;

    public Kalkulator(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public double tambah() {
        return angka1 + angka2;
    }

    public double kurang() {
        return angka1 - angka2;
    }

    public double kali() {
        return angka1 * angka2;
    }

    public double bagi() {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Error: Tidak bisa membagi bilangan dengan 0");
            return Double.NaN;
        }
    }
}
