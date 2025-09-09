import java.util.Scanner;
public class DemoPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        int panjang;
        int lebar;

        System.out.print("Masukkan panjang : ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = sc.nextInt();
        PersegiPanjang pnjg = new PersegiPanjang(panjang, lebar);


        do {
            System.out.println("--- Penghitungan Persegi Panjang ---");
            System.out.println("1. Display Info");
            System.out.println("2. Menghitung Luas");
            System.out.println("3. Menghitung Keliling");
            System.out.println("4. Keluar");
            System.out.print("Pilihan menu (1-4): ");
            pilihan = sc.nextInt();
          

            switch (pilihan) {
                case 1:
                    pnjg.displayInfo();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Luas Persegi panjang : " + pnjg.getLuas());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Keliling Persegi panjang : " + pnjg.getKeliling());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Terima kasih. ^w^");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    System.out.println();
                    break;
            }

        } while (pilihan != 4);
    }
}
