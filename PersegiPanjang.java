public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang (int p, int l) {
        panjang = p;
        lebar = l;
    }

    public void displayInfo() {
        System.out.println("=== INFO PERSEGI PANJANG ===");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}
