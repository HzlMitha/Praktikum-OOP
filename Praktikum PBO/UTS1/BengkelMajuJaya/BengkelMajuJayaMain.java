package UTS1.BengkelMajuJaya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BengkelMajuJayaMain {
    public static void main(String[] args) {
        List<Kendaraan> daftar = new ArrayList<>();
        daftar.add(new Mobil("N 1234 AB", "Toyota", 2020));
        daftar.add(new Motor("N 5678 XY", "Honda", 2022));

        System.out.println("=== Data Servis Bengkel Maju Jaya ===\n");

        Scanner scanner = new Scanner(System.in);
        for (Kendaraan k : daftar) {
            System.out.print("Include cuci untuk " + k.getJenis() + " (y/n)? ");
            String input = scanner.nextLine().trim().toLowerCase();
            boolean includeCuci = input.equals("y") || input.equals("yes") || input.equals("true");
            k.printData(includeCuci);
            System.out.println();
        }
    }
}
