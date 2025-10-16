package Praktikum06.OverloadingSegitiga;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        int sudutA = 40;
        int sudutB = 60;
        int sisiA = 3;
        int sisiB = 4;
        int sisiC = 5;

        System.out.println("Jika sudut A = " + sudutA + " dan sudut B = " + sudutB);
        System.out.println("Maka sudut C adalah " + segitiga.totalSudut(sudutA, sudutB));

        System.out.println("\nJika sudut A = " + sudutA);
        System.out.println("Maka sudut C adalah " + segitiga.totalSudut(sudutA));

        System.out.println("\nJika sisi A = " + sisiA + ", sisi B = " + sisiB + ", dan sisi C = " + sisiC);
        System.out.println("Maka keliling segitiga adalah " + segitiga.keliling(sisiA, sisiB, sisiC));

        System.out.println("\nJika sisi A = " + sisiA + " dan sisi B = " + sisiB);
        System.out.printf("Maka keliling segitiga adalah %.2f\n", segitiga.keliling(sisiA, sisiB));
    }
}
