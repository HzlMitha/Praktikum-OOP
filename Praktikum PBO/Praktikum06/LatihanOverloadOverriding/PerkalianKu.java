package Praktikum06.LatihanOverloadOverriding;

public class PerkalianKu {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        PerkalianKu obj = new PerkalianKu();
        obj.perkalian(25, 43);
        obj.perkalian(34, 23, 56);
    }
}
