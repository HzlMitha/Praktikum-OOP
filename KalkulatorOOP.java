import java.util.Scanner;
public class KalkulatorOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2;
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

        Kalkulator kalkulatorOOP = new Kalkulator(angka1, angka2);
        
        switch (operator) {
            case '+':
                System.out.println("Hasil: " + kalkulatorOOP.tambah());
                break;
            case '-':
                System.out.println("Hasil: " + kalkulatorOOP.kurang());
                break;
            case '*':
                System.out.println("Hasil: " + kalkulatorOOP.kali());
                break;
            case '/':
                double hasilBagi = kalkulatorOOP.bagi();
                if (!Double.isNaN(hasilBagi)) {
                    System.out.println("Hasil: " + hasilBagi);
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid");
                break;
        }

        System.out.println("Mau hitung ulang lagi (y/n): ");
        ulang = sc.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
    }
}


