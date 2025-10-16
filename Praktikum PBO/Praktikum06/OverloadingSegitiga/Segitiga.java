package Praktikum06.OverloadingSegitiga;

public class Segitiga {
    private int sudut;

    public Segitiga() {
        this.sudut = 0;
    }

    public Segitiga(int sudut) {
        this.sudut = sudut;
    }

    public int getSudut() {
        return sudut;
    }

    public void setSudut(int sudut) {
        this.sudut = sudut;
    }

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return sisiA + sisiB + sisiC;
    }
}
