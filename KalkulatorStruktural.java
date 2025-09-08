import java.util.Scanner;

public class KalkulatorStruktural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;
        char ulang;

        do {
            System.out.println("--- Kalkulator Sederhana ---");
            System.out.print("Angka 1 = ");
            angka1 = sc.nextDouble();

            System.out.print("Operator (+, -, *, /) : ");
            operator = sc.next().charAt(0);

            System.out.print("Angka 2 = ");
            angka2 = sc.nextDouble();

            switch(operator) {
                case '+':
                    hasil = angka1 + angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil: " + hasil);
                    } else {
                        System.out.println("Error: Tidak bisa membagi bilangan dengan 0");
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid!");
                    break;    
            }

            System.out.print("Mau hitung ulang lagi? (y/n): ");
            ulang = sc.next().charAt(0);
            System.out.println();

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Kalkulator selesai, Terima kasih!");

    }
}
