public class DemoPersegiPnjg {
    public static void main(String[] args) {
        PersegiPanjang1 persegi1 = new PersegiPanjang1();
        persegi1.panjang = 20;
        persegi1.lebar = 30;

        persegi1.displayInfo();
        int luas = persegi1.getLuas();
        System.out.println("Luas Persegi panjang : " + luas);
        int keliling = persegi1.getKeliling();
        System.out.println("Keliling Persegi panjang : " + keliling);
    }

}
